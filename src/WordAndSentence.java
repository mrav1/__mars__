public class WordAndSentence {

    public static void main(String[] args) {
        System.out.println(isWordPresent("I am an Indian!", "Indian"));
    }

    private static boolean isWordPresent(String s, String word) {
        String[] words = s.split(" ");
        for (String w : words) {
            if (w.compareTo(word) == 0) return true;
        }
        return false;
    }
}
