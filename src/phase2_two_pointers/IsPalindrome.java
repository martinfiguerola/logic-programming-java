package phase2_two_pointers;

public class IsPalindrome {

    public static void main(String[] args) {

        IsPalindrome solver = new IsPalindrome();

        String str = "abba";

        boolean response = solver.isPalindrome(str);

        System.out.println("Is palindrome? " + response );
    }

    public boolean isPalindrome (String str) {

        if (str == null || str.isEmpty()) throw new IllegalArgumentException("String must not be null or empty");

        int leftPointer = 0;
        int rightPointer = str.length() - 1;

        while (leftPointer < rightPointer) {

            char leftCharacter =  str.charAt(leftPointer);
            char rightCharacter =  str.charAt(rightPointer);

            if (leftCharacter != rightCharacter) return false;

            leftPointer++;
            rightPointer--;
        }

        return true;
    }
}
