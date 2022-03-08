import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    static List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        String s = "abc";
        permute(s.toCharArray(), 0, s.length()-1);
        System.out.println(res);
    }

    static void permute(char[] arr, int l, int r) {

        if (l == r) {
            res.add(String.valueOf(arr));
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }

    static void swap(char[] arr, int l, int r) {
        char tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

}
