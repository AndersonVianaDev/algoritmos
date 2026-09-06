package easy;

public class Exercise_917 {

    public static String reverseOnlyLetters(String word) {
        char[] chars = word.toCharArray();

        int left = 0;
        int right = chars.length-1;

        while (left<right) {
            if(!Character.isLetter(chars[left])) {
                left++;
                continue;
            }

            if(!Character.isLetter(chars[right])) {
                right--;
                continue;
            }

            char aux = chars[left];
            chars[left] = chars[right];
            chars[right] = aux;
            left++;
            right--;
        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}
