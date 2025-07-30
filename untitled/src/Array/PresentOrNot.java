package Array;

public class PresentOrNot {
    public static void main(String[] args) {
        int find=22;
        int[] arr = {10, 20, 30, 40, 50};
        for (int num : arr){
            if (num == find){
                System.out.println("Present");
                return;
            }
        }
        System.out.println("Not Present");
    }
}
