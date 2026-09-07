package easy;

public class Exercise_557 {

    public static String reverseWords(String word) {
        int left = 0;
        int right = 0;

        String resp = "";
        while (right < word.length()) {
            if(!" ".equalsIgnoreCase(String.valueOf(word.charAt(right))) && right+1 != word.length()) {
                right+=1;
                continue;
            }

            String aux = new StringBuilder(word.substring(left, right+1)).reverse().toString();

            right +=1;
            left = right;

            resp += aux + " ";
        }

        return resp.trim();
    }

    public static void main(String[] args) {
        String inverted = reverseWords("estou sozinho");

        System.out.println(inverted);
    }
}
