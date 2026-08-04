package easy;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        if(x < 0 ) return false;
        String numString = Integer.toString(x);

        int start = 0;
        int finish = numString.length()-1;

        while (start<finish) {
            if(numString.charAt(start) != numString.charAt(finish)) return false;

            start++;
            finish--;
        }

        return true;
    }

    public static boolean isPalindromeSolution(int x) {
        if(x<0 || (x%10==0 && x!=0)) return false;

        int reversed = 0;

        // 121 > 0 true
        // 12 > 1 true
        // 1 > 12 false
        while (x>reversed) {
            System.out.println("antes x: " + x);
            System.out.println("antes reversed: "+ reversed);
            // 0 = 0 * 10 + 121 % 10
            // reversed = 1;

            // 1 = 1 * 10 + 12 % 10
            // reversed = 12
            reversed = reversed * 10 + x % 10;
            System.out.println("depois reversed: "+ reversed);

            // x = 12
            // x = 1
            x /= 10;
        }

        // 1 == 12 false // 1 == (12/10 = 1) true)
        return x==reversed || x==reversed/10;
    }

    public static void main(String[] args) {
        System.out.println("Is palindrome: " + isPalindrome(121));
        System.out.println("Is palindrome: " + isPalindrome(-121));

        System.out.println("is palidrome: " + isPalindromeSolution(121));
    }
}
