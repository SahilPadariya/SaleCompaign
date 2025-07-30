package Array;

public class PrintAlternate {
    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 70, 80, 90, 100};

        for (int i=0; i< arr1.length; i++){
            System.out.print(arr1[i]+","+arr2[i]+",");
        }
        System.out.println();
        //from last
        for (int i=arr1.length-1; i>=0; i--){
            System.out.print(arr1[i]+","+arr2[i]+",");
        }
    }
}
