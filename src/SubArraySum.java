import java.util.HashMap;
import java.util.Map;

public class SubArraySum {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{3, 2, 1}, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> preMap = new HashMap<>();
        preMap.put(0, 1);
        for (int num : nums) {
            sum += num;
            if (preMap.containsKey(sum - k))
                count += preMap.get(sum - k);
            preMap.put(sum, preMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

}