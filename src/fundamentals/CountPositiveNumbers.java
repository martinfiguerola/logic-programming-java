package fundamentals;

public class CountPositiveNumbers {

    public static void main(String[] args) {

        CountPositiveNumbers solver = new CountPositiveNumbers();

        int total = solver.countPositiveNumbers(new int[] {1, 20, 12, 3, 7, 34 });

        System.out.println("The total is: " + total);

    }

    public int countPositiveNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                count++;
            }
        }

        return count;
    }

}
