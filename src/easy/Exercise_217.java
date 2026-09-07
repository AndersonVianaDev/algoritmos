package easy;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise_217 {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(Integer n : nums) {
            if(set.contains(n)) {
                return true;
            }
            set.add(n);
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
    }
}
