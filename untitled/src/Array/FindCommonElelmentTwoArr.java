package Array;

import java.util.HashSet;

public class FindCommonElelmentTwoArr {
    public static void main(String[] args) {
        boolean flag = false;
        int arr1[]={10,20,30,40,50};
        int arr2[]={1,2,3,4,5,6,7,8,9};
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr1){
            set.add(num);
        }
        for (int num : arr2){
            if (set.contains(num)){
                System.out.print(num+",");
                flag=true;
            }
        }
        if (!flag){
            System.out.println("No any common value");
        }
    }
}
