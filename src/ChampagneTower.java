public class ChampagneTower {
    public static void main(String[] args) {
        System.out.println(champagneTower(2,1,1));
    }
    public static double champagneTower(int poured, int query_row, int g) {
        double[] res = new double[query_row + 2];
        res[0] = poured;
        for (int row = 1; row <= query_row; row++) {
            for (int glassIndex = row; glassIndex >= 0; glassIndex--) {
                res[glassIndex] = Math.max(0.0, (res[glassIndex] - 1) / 2);
                res[glassIndex + 1] += res[glassIndex];
            }
        }
        return Math.min(res[g], 1.0);
    }
}
