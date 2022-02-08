import java.io.PrintStream;

public class FindDiffStrings {
    public static void main(String[] args) {
        char res = findDiffStrings("abc", "abcd");
        System.out.println(res);
    }

    private static char findDiffStrings(String s, String t) {
        char c = t.charAt(t.length() - 1);
        for (int i = 0; i < s.length(); i++) {
            c ^= t.charAt(i) ^ s.charAt(i);
        }
        return c;
    }
}
