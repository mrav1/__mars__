public class BitCount {
    public static void main(String[] args) {
        int n = 10;
        int[] res = new int[n+1];
        for (int i = 1; i <= n; i++)
            res[i] = res[i>>1] + (i & 1);
    }

}
