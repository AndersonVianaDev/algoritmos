package easy;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (Character.toLowerCase(word.charAt(start)) != Character.toLowerCase(word.charAt(end)))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println("Is palindrome: " + isPalindrome("Ana"));
    }
}
