import java.util.ArrayList;
import java.util.List;

public class GenParens {

    public static void main(String[] args) {
        List<String> ps = new ArrayList<>();
        gen(ps, "", 0, 0, 3);
        System.out.println(ps);
    }

    private static void gen(List<String> ps, String s, int open, int closed, int n) {
        if (closed == n) {
            ps.add(s);
            return;
        }

        if (open < n) gen(ps, s + "(", open + 1, closed, n);
        if (closed < open) gen(ps, s + ")", open, closed + 1, n);
    }
}
