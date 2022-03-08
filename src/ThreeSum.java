import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        sum3(arr);
    }

    private static List<List<Integer>> sum3(int[] arr) {
        if (arr.length == 0) return new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    res.add(Arrays.asList(arr[i], arr[j++], arr[k--]));
                } else if (sum > 0) k--;
                else if (sum < 0) j++;
            }
        }

        return new ArrayList<>(res);
    }
}
