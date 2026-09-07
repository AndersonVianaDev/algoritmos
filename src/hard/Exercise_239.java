package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Exercicio para praticar e melhorar no futuro a solução
public class Exercise_239 {
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0;
        int right = 0;
        List<Integer> result = new ArrayList<>();

        while (right <= nums.length) {
            int difference = right - left;
            if(difference < k) {
                right++;
                continue;
            }

            if(difference == k) {
                int[] subArray = new int[k];
                int index = 0;
                for(int i=left; i<right; i++) {
                    subArray[index] = nums[i];
                    index++;
                }

                int max = subArray[0];
                for (int n : subArray) {
                    max = Math.max(max, n);
                }

                result.add(max);
            }
            left++;
        }

        return result.stream().mapToInt(n -> n).toArray();
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }
}
