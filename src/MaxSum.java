public class MaxSum {

    public static void main(String[] args) {
        int[] arr = {200, 300, 130};
        System.out.println(solve(arr));
    }

    private static int solve(int[] arr) {
        int incl = 0;
        int excl = 0;
        for (int i = 0; i < arr.length; i++) {
            int max = incl > excl ? incl : excl;
            incl = excl + arr[i];
            excl = max;
        }
        return incl > excl ? incl : excl;
    }

}
