package easy;

public class Exercise_557 {

    public static String reverseWords(String word) {
        int left = 0;
        int right = 0;

        String resp = "";
        while (right < word.length()) {
            boolean isSpace = word.charAt(right) == ' ';

            if(!isSpace && right+1 != word.length()) {
                right+=1;
                continue;
            }

            int end = isSpace ? right : right+1;
            String aux = new StringBuilder(word.substring(left, end)).reverse().toString();

            right +=1;
            left = right;

            resp += aux + " ";
        }

        return resp.trim();
    }

    public static void main(String[] args) {
        String inverted = reverseWords("Let's take LeetCode contest");

        System.out.println(inverted);
    }
}
