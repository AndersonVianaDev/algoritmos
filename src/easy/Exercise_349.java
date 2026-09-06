package easy;

import java.util.*;

public class Exercise_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(Integer n : nums1) {
            set1.add(n);
        }

        for(Integer n : nums2) {
            set2.add(n);
        }

        Set<Integer> smaller = set1.size() <= set2.size() ? set2 : set1;
        Set<Integer> larger = set1 == smaller ? set2 : set1;

        List<Integer> result = new ArrayList<>();
        for(int n : smaller) {
            if(larger.contains(n)) {
                result.add(n);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
