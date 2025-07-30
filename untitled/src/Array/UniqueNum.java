package Array;

public class UniqueNum {
    public static void main(String[] args) {
        int num = 1;
        int []nums = {1,2,3,4,6};

        for (int n  : nums){
           if (num == n){
               System.out.println("Not Unique");
               return;
           }
        }
        System.out.println("Unique");
    }
}
