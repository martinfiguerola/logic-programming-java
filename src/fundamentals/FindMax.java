package fundamentals;

public class FindMax {

    public static void main(String[] args) {

        FindMax solver = new FindMax();

        int[] nums = new int[] {21, 6 , 19, 34};

        int maxElement = solver.findMax(nums);

        System.out.println("The max element is: " + maxElement);

    }

    public int findMax (int[] nums) {

        if (nums == null || nums.length == 0) throw new IllegalArgumentException("The array is empty");

        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int currentElement = nums[i];

            if (currentElement > currentMax) currentMax = currentElement;
        }

        return currentMax;
    }
}
