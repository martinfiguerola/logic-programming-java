package phase2_two_pointers;

import java.util.Arrays;

public class ReverseInPlace {

    public static void main(String[] args) {

        ReverseInPlace solver = new ReverseInPlace();

        int[] nums = new int[]{4, 3, 2, 1};

        int[] reversed = solver.reverseInPlace(nums);

        System.out.println("The reversed array: " + Arrays.toString(reversed));
    }

    public int[] reverseInPlace(int[] nums) {

        if (nums == null || nums.length == 0) throw new IllegalArgumentException("The array must not be null or empty");

        int leftPointer = 0;
        int rightPointer = nums.length - 1;

        while (leftPointer < rightPointer) {

            int temp = nums[leftPointer];

            nums[leftPointer] = nums[rightPointer];
            nums[rightPointer] = temp;

            leftPointer++;
            rightPointer--;
        }

        return nums;
    }
}
