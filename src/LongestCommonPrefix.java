public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        // 'strs' has one string
        if (strs.length == 1) return strs[0];

        // any string empty
        for (String s : strs)
            if (s.length() == 0) return "";

        int i = 0;
        while (true) {
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || c != strs[j].charAt(i))
                    return strs[0].substring(0, i);
            }

            i++;
            if (i >= strs[0].length())
                return strs[0].substring(0, i);
        }

    }

}

