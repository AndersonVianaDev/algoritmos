package easy;

import java.util.HashMap;
import java.util.Map;

public class Exercise_136 {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer n : nums) {
            Integer total = map.getOrDefault(n, 0);
            map.put(n, total+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
