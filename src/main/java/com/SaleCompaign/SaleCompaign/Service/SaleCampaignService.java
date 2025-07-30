package com.SaleCompaign.SaleCompaign.Service;

import com.SaleCompaign.SaleCompaign.DTO.CampaignDTO;
import com.SaleCompaign.SaleCompaign.Model.Discount;
import com.SaleCompaign.SaleCompaign.Model.History;
import com.SaleCompaign.SaleCompaign.Model.Product;
import com.SaleCompaign.SaleCompaign.Model.SaleCampaign;
import com.SaleCompaign.SaleCompaign.Myscheduker.MyScheduler;
import com.SaleCompaign.SaleCompaign.Repository.DiscountRepository;
import com.SaleCompaign.SaleCompaign.Repository.HistoryRepository;
import com.SaleCompaign.SaleCompaign.Repository.ProductRepository;
import com.SaleCompaign.SaleCompaign.Repository.SaleCampaignRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.*;

import java.time.LocalDate;
import java.util.*;

@Service
public class SaleCampaignService {


    @Autowired
    ProductRepository productRepository;
    @Autowired
    SaleCampaignRepository saleCampaignRepository;
    @Autowired
    DiscountRepository discountRepository;
    @Autowired
    HistoryRepository historyRepository;

    public String AddProduct(List<Product> product) {
        productRepository.saveAll(product);
        List<History> history = new ArrayList<>();
        for (Product p1 : product) {
            History history1 = new History(p1.getId(), p1.getMrp(), p1.getDiscount(), LocalDate.now(), "Add Product");
            history.add(history1);
        }
        historyRepository.saveAll(history);
        return "Product Add Successfully";
    }

    public Map<String, Object> GetAllProduct(int size, int number) {

        PageRequest pageable = PageRequest.of(number, size);
        Page<Product> page = productRepository.findAll(pageable);

        List<Product> mainPage = page.getContent();

        List<Product> finalProductList = new ArrayList<>();
        List<History> historyList = new ArrayList<>();

        for (Product temp : mainPage) {
            Discount discount = discountRepository.getProductById(temp.getId());

            if (discount == null) {
                finalProductList.add(temp);
                continue;
            }

            SaleCampaign saleCampaign = saleCampaignRepository
                    .findById(discount.getCampaign_id())
                    .orElse(null);

            if (saleCampaign != null &&
                    "Current".equalsIgnoreCase(saleCampaign.getStatus())) {

                double finalPrice = temp.getCurrent_price() - temp.getCurrent_price() * ((double) discount.getDiscount() / 100);

                finalProductList.add(AddProduct(temp, discount, finalPrice));
                historyList.add(AddProductInHistory(temp, discount, finalPrice, saleCampaign.getCampaign_name()));

            } else {
                finalProductList.add(temp);
            }
        }

        historyRepository.saveAll(historyList);

        Map<String, Object> map = new HashMap<>();
        map.put("Product", finalProductList);
        map.put("page", number + 1);
        map.put("PageSize", size);
        map.put("TotalPage", page.getTotalPages());
        return map;
    }


    public String AddSaleCampaign(CampaignDTO campaignDTO) {
        SaleCampaign saleCampaign = new SaleCampaign(
                campaignDTO.getCampaign_name(),
                campaignDTO.getStart_date(),
                campaignDTO.getEnd_date(),
                saleCampaignRepository.getCampaignStatus(campaignDTO.getStart_date()
                        , campaignDTO.getEnd_date()));

        saleCampaignRepository.save(saleCampaign);

        List<Discount> list = campaignDTO.getDiscount();

        List<Integer> ids = saleCampaignRepository.findAllByTitle(campaignDTO.getCampaign_name());

        if (ids.isEmpty()) {
            return "Campaign Is Not Found";
        }
        int id = ids.get(0);
        List<Discount> mainList = new ArrayList<>();
        for (Discount d1 : list) {
            Discount d2 = new Discount(d1.getProduct_id(), id, d1.getDiscount());
            mainList.add(d2);
        }
        discountRepository.saveAll(mainList);
        return "Add Successfully Campaign of your Product";
    }

    public Product AddProduct(Product temp, Discount discount, double finalPrice) {
        return new Product(
                temp.getId(),
                temp.getTitle(),
                (int) temp.getCurrent_price(),
                finalPrice,
                discount.getDiscount(),
                temp.getInventory_count()
        );
    }

    public History AddProductInHistory(Product temp, Discount discount, double finalPrice, String CampaignName) {
        return new History(
                temp.getId(),
                (int) finalPrice,
                discount.getDiscount(),
                LocalDate.now(),
                CampaignName
        );
    }
}
