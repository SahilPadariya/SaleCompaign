package com.SaleCompaign.SaleCompaign.Controller;

import com.SaleCompaign.SaleCompaign.DTO.CampaignDTO;
import com.SaleCompaign.SaleCompaign.Model.Product;
import com.SaleCompaign.SaleCompaign.Service.SaleCampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("SaleCampaign")
public class controller {

    @Autowired
    SaleCampaignService saleCampaignService;

    @PostMapping("/ProductAdd")
    public String AddProduct(@RequestBody List<Product> product) {
        return saleCampaignService.AddProduct(product);
    }

    @GetMapping("/Get")
    public Map<String, Object> get(@RequestParam(value = "Size", defaultValue = "10") int Size,
                                   @RequestParam(value = "PageNumber", defaultValue = "1") int Pagenumber) {
        return saleCampaignService.GetAllProduct(Size, Pagenumber - 1);
    }

    @PostMapping("campaign")
    public String AddCampaign(@RequestBody CampaignDTO campaignDTO) {
        return saleCampaignService.AddSaleCampaign(campaignDTO);
    }
}
