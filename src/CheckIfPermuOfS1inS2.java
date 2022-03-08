public class CheckIfPermuOfS1inS2 {
    // https://leetcode.com/problems/permutation-in-string/discuss/102588/Java-Solution-Sliding-Window

    boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length(), l2 = s2.length();
        if (l1 > l2) return false;

        int[] count = new int[26];
        // First window check
        for (int i = 0; i < l1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;

        // Slide window & check
        for (int i = l1; i < l2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - l1) - 'a']++;
            if (allZero(count)) return true;
        }
        return false;
    }

    boolean allZero(int[] count) {
        for (int n : count)
            if (n != 0) return false;
        return true;
    }

}
