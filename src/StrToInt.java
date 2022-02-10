public class StrToInt {
    public static void main(String[] args) {
        System.out.println(myAtoi("-6147483648"));
    }

    public static int myAtoi(String s) {
        if (s == null) return 0;
        s = s.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        int sign = 1;
        if (s.charAt(0) == '-') sign = -1;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') i = 1;

        int res = 0;

        while(i < s.length()){
            int digit = s.charAt(i) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(res >= Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE %10)
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            res = 10 * res + digit;
            i ++;
        }
        return res * sign;
    }
}
