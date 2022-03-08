public class IsSequence {

    public static void main(String[] args) {
        String s = "abv";
        String t = "adfbghjk";
        System.out.println(isSeq(s, t));
    }

    private static boolean isSeq(String s, String t) {
        if(s.length()==0) return true;
        int i = 0, j = 0;
        while (j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                if(i==s.length()) return true;
            }
            j++;
        }
        return false;
    }

}
