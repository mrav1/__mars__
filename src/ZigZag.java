public class ZigZag {
    //https://leetcode.com/problems/zigzag-conversion/
    //Input: s = "PAYPALISHIRING", numRows = 3
    //Output: "PAHNAPLSIIGYIR"
    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag();
        String s = "PAYPALISHIRING";
        System.out.println(zigZag.convert(s, 3));
        System.out.println("PAHNAPLSIIGYIR");
    }


    public String convert(String s, int numRows) {
        int i = 0;
        int len = s.length();

        // create numRows of buffers
        StringBuffer sb[] = new StringBuffer[len];
        for (int j = 0; j < sb.length; j++) {
            sb[j] = new StringBuffer();
        }

        while (i < len) {
            for (int j = 0; j < numRows && i < len; j++) // append to each buffer top down
                sb[j].append(s.charAt(i++));
            for (int j = numRows - 2; j >= 1 && i < len; j--) { // append mid buffers(except last & first) bottom-up
                sb[j].append(s.charAt(i++));
            }
        }

        for (int j = 1; j < sb.length; j++) { // merge all buffers to buffer at 0 index
            sb[0].append(sb[j]);
        }

        return sb[0].toString();
    }

}
