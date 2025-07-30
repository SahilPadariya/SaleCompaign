package Array;

import java.util.Scanner;

public class PrintNthElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number : ");
        int i = scanner.nextInt();
        if (i<1){
            System.out.println("Not valid index");
        }
        else if (i<=arr.length){
            System.out.println(arr[i-1]);
        }
        else {
            System.out.println("Out of length");
        }
    }
}
