package phase2_sliding_window;

import java.util.Arrays;

public class MaxSubarraySum {

    public static void main(String[] args) {

        MaxSubarraySum solver = new MaxSubarraySum();

        int[] nums = new int[] {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(solver.maxSubarraySum(nums, k));

    }

    public int maxSubarraySum(int[] nums, int k) {

        if (nums == null || nums.length == 0) throw new IllegalArgumentException("The array cannot be null or empty");
        if (k <= 0 || k > nums.length) throw new IllegalArgumentException("The int must be valid");

        int currentSum = 0;

        for (int i = 0; i < k ; i++){
            currentSum += nums[i];
        }

        int maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i-k]  + nums[i];
            if (currentSum > maxSum) maxSum = currentSum;
        }

        return maxSum;
    }

}
