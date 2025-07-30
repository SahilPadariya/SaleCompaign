package Array;

public class PairOfSumTwoPointer {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8,9};
        int target = 14;

        int left=0,right=nums.length-1;
        while (left<right){
            if (nums[left]+nums[right]==target){
                System.out.println("Present");
                return;
            } else if (nums[left]+nums[right]>target) {
                right--;
            }
            else {
                left++;
            }
        }
        System.out.println("Not Present");
    }
}
