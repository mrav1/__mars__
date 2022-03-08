public class IntToRoman {
    /*
    I-1
    V-5
    X-10
    L-50
    C-100
    D-500
    M-1000
     */

    public static void main(String[] args) {
        System.out.println(intToRoman(1519));
    }

    static String intToRoman(int num){
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] rom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length ; i++) {
            while(num>=values[i]){
                if(num>=values[i]){
                    num -= values[i];
                    sb.append(rom[i]);
                }
            }
        }

        return sb.toString();
    }
}
