package Array;

import java.util.HashSet;
import java.util.Set;

public class PairSumPresentOrNot {
    public static void main(String[] args) {
        int nums[] = {2,7,0,5,6};
        int target = 10;
        Set<Integer>set=new HashSet<>();

        for (int num : nums){
            if (set.contains(target-num)){
                System.out.println("Present");
                return;
            }
            set.add(num);
        }
        System.out.println("Not Present");
    }
}
