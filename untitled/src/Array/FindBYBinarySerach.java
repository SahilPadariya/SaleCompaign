package Array;

public class FindBYBinarySerach {
    public static void main(String[] args) {
        int num = 9;
        int nums[]={1,2,5,6,9,8};
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=left+right/2;
            if (nums[mid]==num){
                System.out.println("Present");
                return;
            } else if (nums[mid]>num) {
                right=mid-1;
            }
            else {
                left = mid+1;
            }
        }
        System.out.println("Not Present");
    }
}
