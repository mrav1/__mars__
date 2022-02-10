public class ReverseInt {
    public static void main(String[] args) {
        //4294967296
        System.out.println(reverse(153423649));
    }

    private static int reverse(int num) {
        int result = 0;
        while (num != 0) {
            int tail = num % 10;
            int tmp = result * 10 + tail;

            if ((tmp - tail) / 10 != result) // handle int overflow
                return 0;

            result = tmp;
            num /= 10;
        }
        return result;
    }

}
