public class Sort012 {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 2, 0, 0, 1, 0};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static void sort(int[] arr) {
        int zeroPtr = 0, onePtr = 0, twoPtr = arr.length - 1;
        while (onePtr <= twoPtr) {
            if (arr[onePtr] == 0) {
                int tmp = arr[onePtr];
                arr[onePtr] = arr[zeroPtr];
                arr[zeroPtr] = tmp;
                zeroPtr += 1;
                onePtr += 1;
            } else if (arr[onePtr] == 1) {
                onePtr += 1;
            } else {
                int tmp = arr[onePtr];
                arr[onePtr] = arr[twoPtr];
                arr[twoPtr] = tmp;
                twoPtr -= 1;
            }
        }
        System.out.println(zeroPtr + "==" + onePtr + "==" + twoPtr);
    }
}
