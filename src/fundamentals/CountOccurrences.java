package fundamentals;

public class CountOccurrences {

    public static void main(String[] args) {

        CountOccurrences solver = new CountOccurrences();

        int x = 5;

        int numberOfTimes = solver.countOccurrences(x, new int[] {1, 5, 3, 5, 5, 2});

        System.out.println("The number of times " + x + " appears is: " + numberOfTimes);
    }

    public int countOccurrences(int x, int[] nums) {

        if (nums.length == 0) throw new IllegalArgumentException("The array is empty");

        int count = 0;

        for (int num : nums) {
            if (num == x) count++;
        }

        return count;
    }
}
