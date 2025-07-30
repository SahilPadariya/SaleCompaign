package Array;

public class HowManyNumSmaller {
    public static void main(String[] args) {
        int number=5;
        int []nums= {10,20,4,5,6,3,2,1};
        int count=0;
        for (int num : nums){
            if (num<number){
                count++;
            }
        }
        System.out.println(count);
    }
}
