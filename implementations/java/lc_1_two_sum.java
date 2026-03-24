import java.util.HashMap;

public class lc_1_two_sum {

    public static void main(String[] args) {
        int res[] = twoSum(new int[] { 2, 7, 11, 15 }, 9);
        System.out.println(String.format("%d %d", res[0], res[1]));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int aux = target - nums[i];
            if (mapa.containsKey(aux))
                return new int[] { mapa.get(aux), i };
            mapa.put(nums[i], i);
        }
        return new int[] {};
    }
}
