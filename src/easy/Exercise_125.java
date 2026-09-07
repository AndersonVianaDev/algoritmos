package easy;

public class Exercise_125 {
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        s = s.toLowerCase();

        while (left<right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
                continue;
            }

            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        //System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("0P"));
        //System.out.println(isPalindrome(" "));
    }
}
