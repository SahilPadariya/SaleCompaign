package Array;

import java.util.Scanner;

public class PrintnthElementFromLast {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a num :");
        int index = scanner.nextInt();
        if (index<1){
            System.out.println("No valid index");
        } else if (index > arr.length) {
            System.out.print("Out of length");
        }
        else System.out.print(arr[arr.length-index]);
    }
}
