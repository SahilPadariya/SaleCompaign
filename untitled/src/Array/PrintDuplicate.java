package Array;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicate {
    public static void main(String[] args) {

        int []nums ={10,20,30,40,45,1,10,1,2,3,5,5,5,2,20,0,20,1,2,0,2,3,0,2,0,4,0};
        Set<Integer> set=new HashSet<>();
        for (int i=0; i<nums.length; i++){
            if (set.contains(nums[i])){
                nums[i] = -1;
            }
            set.add(nums[i]);
        }
        for (int num : nums){
            if (set.contains(num) && num>=0){
                System.out.print(num+",");
            }
        }
    }
}
