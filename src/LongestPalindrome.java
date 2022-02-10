public class LongestPalindrome {

    public static void main(String[] args) {
        String s = "babad";
        LongestPalindrome lp = new LongestPalindrome();
        System.out.println(lp.longestPalindrome(s));
    }

    String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int leftIndex = i;
            int rightIndex = i;
            char c = s.charAt(i);

            // check same char as c on left
            while (leftIndex >= 0 && c == s.charAt(leftIndex))
                leftIndex--;

            // check same char as c on right
            while (rightIndex < s.length() && c == s.charAt(rightIndex))
                rightIndex++;

            // check if left & right chars match
            while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
                leftIndex--;
                rightIndex++;
            }

            // Adjust leftIndex as it may go below zero
            // rightIndex is fine as substring method excludes rightIndex
            leftIndex += 1;

            // check if new palindrome string is longer
            if (end - start < rightIndex - leftIndex) {
                start = leftIndex;
                end = rightIndex;
            }
        }
        return s.substring(start, end);
    }

}
