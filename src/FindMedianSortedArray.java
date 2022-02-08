public class FindMedianSortedArray {

    public static void main(String[] args) {
        FindMedianSortedArray sl = new FindMedianSortedArray();
        System.out.println(sl.findMedianSortedArrays(new int[]{2, 5}, new int[]{3, 4}));
    }

    public double findMedianSortedArrays(int[] input1, int[] input2) {
        if (input1.length > input2.length) {
            return findMedianSortedArrays(input2, input1);
        }

        int x = input1.length;
        int y = input2.length;

        int low = 0;
        int high = x;
        while (low <= high) {
            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxLeftX = partitionX == 0 ? Integer.MIN_VALUE : input1[partitionX - 1];
            int minRightX = partitionX == x ? Integer.MAX_VALUE : input1[partitionX];

            int maxLeftY = partitionY == 0 ? Integer.MIN_VALUE : input2[partitionY - 1];
            int minRightY = partitionY == y ? Integer.MAX_VALUE : input2[partitionY];
            if (maxLeftX <= minRightY && maxLeftY <= minRightX)//right partition
            {
                if ((x + y) % 2 == 0) {
                    return ((double) Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2;
                } else {
                    return (double) Math.max(maxLeftX, maxLeftY);
                }

            } else if (maxLeftX > minRightY) //move high
            {
                high = partitionX - 1;
            } else { // move low
                low = partitionX + 1;
            }
        }

        return 0;
    }

}
