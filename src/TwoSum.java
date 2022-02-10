import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] ts1 = ts.twoSum(new int[]{3,2,4}, 6);
        for(int s: ts1)
            System.out.println(s);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                res[0]=map.get(target-nums[i]);
                res[1]=i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
