package Array;

public class FindLargeElement {
    public static void main(String[] args) {
        int []arr={1,2,8,3,6,5,1,5,7,950};
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
