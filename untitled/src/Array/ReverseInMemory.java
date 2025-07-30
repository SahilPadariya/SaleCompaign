package Array;

import java.util.Arrays;

public class ReverseInMemory {
    public static void main(String[] args) {
        int[]nums={1,2,3,4,5};
        int left=0,rigth=nums.length-1;
        while(left<rigth){
            nums[left]=nums[left]+nums[rigth];
            nums[rigth]=nums[left]-nums[rigth];
            nums[left]=nums[left]-nums[rigth];
            left++;
            rigth--;
        }
        System.out.println(Arrays.toString(nums));
    }
}
