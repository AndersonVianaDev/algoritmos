package easy;

public class Exercise_557 {

    // Solução utilizando os métodos do java
    public static String reverseWordsJava(String word) {
        String[] words = word.split(" ");
        String result = "";
        for(String s : words) {
            String wordInverted = new StringBuilder(s).reverse().toString();
            result += wordInverted + " ";
        }

        return result.trim();
    }

    // Solução com 2 ponteiros
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
        String inverted = reverseWordsJava("Let's take LeetCode contest");

        System.out.println(inverted);
    }
}
