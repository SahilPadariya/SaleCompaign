package Array;

public class ThirdMax {
    public static void main(String[] args) {
        int []nums = {60,60,60};
        int max1=0,max2=0,max3=0;
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max3 = max2;
                max2 = num;
            } else if (num > max3 && num != max2) {
                max3 = num;
            }
        }
        System.out.println(max3);
    }
}
