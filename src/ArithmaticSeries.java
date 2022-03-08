import com.sun.source.tree.Tree;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArithmaticSeries {

    public static void main(String[] args) {
        System.out.println(numberOfArithmeticSlices(new int[]{1, 2, 3, 4, 5, 6}));
        Set<String> s = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
        s.add("VISA");
        s.add("Visa");
        s.add("Amex");
        s.add("AMEX");
        System.out.println(s);

    }

    public static int numberOfArithmeticSlices(int[] A) {
        int curr = 0, sum = 0;
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                System.out.println((i - 2) + "-" + i);
                curr += 1;
                sum += curr;
            } else {
                System.out.println("--");
                curr = 0;
            }
        }
        return sum;
    }

}
