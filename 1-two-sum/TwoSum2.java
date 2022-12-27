import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tempMap = new HashMap<>(nums.length);
        for(int i = 0; i < nums.length; i++) {
            if (tempMap.containsKey(target - nums[i])) {
                return new int[]{tempMap.get(target - nums[i]), i};
            }
            tempMap.put(nums[i], i);
        }
        return null;
    }
}
