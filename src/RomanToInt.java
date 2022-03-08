import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public int romanToInt(String r) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int z = 0;
        for (int i = 0; i < r.length(); i++) {
            if (i + 1 < r.length() && map.get(r.charAt(i)) < map.get(r.charAt(i + 1)))
                z -= map.get(r.charAt(i));
            else z += map.get(r.charAt(i));
        }
        return z;
    }

}
