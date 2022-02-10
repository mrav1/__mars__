public class PatternMatch {
    //https://leetcode.com/problems/regular-expression-matching/

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a*"));
    }

    public static boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        char[] sc = s.toCharArray(), pc = p.toCharArray();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;

        for (int i = 2; i <= n; i++) {
            if (pc[i - 1] == '*') { // handle *, means without *'s prev char
                dp[0][i] = dp[0][i - 2];
            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (sc[i - 1] == pc[j - 1] || pc[j - 1] == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pc[j - 1] == '*') {
                    if (sc[i - 1] == pc[j - 2] || pc[j - 2] == '.') {
                        dp[i][j] = dp[i][j - 2] || dp[i][j - 1] || dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i][j - 2];
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[m][n];
    }

}
