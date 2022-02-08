public class AddDigits {

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }

    /*
    1 1
    2 2
    3 3
    4 4
    5 5
    6 6
    7 7
    8 8
    9 9

    10 1
    11 2
     */
    static int addDigits(int num) {
        if (num == 0) return 0;
        return num % 9 == 0 ? 9 : num % 9;
        //return 1 + (num - 1) % 9;
    }

}
