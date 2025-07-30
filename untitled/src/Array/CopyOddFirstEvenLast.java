package Array;

import java.util.Arrays;

public class CopyOddFirstEvenLast {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7,8,9,10};
        int[] ans= new int[nums.length];
        int first=0;
        int Last=ans.length-1;
        for (int i=0; i<nums.length; i++){
            if (nums[i] % 2 != 0){
                ans[first++]=nums[i];
            }else {
                ans[Last--]=nums[i];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
