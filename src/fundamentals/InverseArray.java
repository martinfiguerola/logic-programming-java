package fundamentals;

import java.util.Arrays;

public class InverseArray {

    public static void main(String[] args) {

        InverseArray solver = new InverseArray();

        int[] nums = {1, 2, 3, 4};

        int[] inverseNewArray = solver.inverseArray(nums);

        System.out.println("The new array: " + Arrays.toString(inverseNewArray));
    }

    public int[] inverseArray(int[] nums) {

        if (nums == null || nums.length == 0) throw new IllegalArgumentException("The array must be valid");

        int[] newArray = new int[nums.length];
        int index = 0;

        for (int i = nums.length - 1; i >= 0; i--){
            newArray[index] = nums[i];
            index++;
        }

        return newArray;
    }
}
