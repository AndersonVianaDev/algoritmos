package easy;

import java.util.HashMap;
import java.util.Map;

public class Exercise_01 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(nums[i]-target)) {
                result[0] = map.get(nums[i]-target);
                result[1] = i;
                return result;
            }

            map.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{2,7,11,15};
        int target = 9;

        System.out.println(twoSum(numbers, target));
    }
}
