package Array;

public class CountOddEven {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int odd=0;
        int even=0;
        for (int num : arr){
            if (num %2 ==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.print("Odd : "+odd+" "+"Even : "+even);
    }
}
