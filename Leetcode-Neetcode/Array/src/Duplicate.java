import java.util.Arrays;

public class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
            int[] arr = new int[20000];
            Arrays.fill(arr, -10001);

            for (int num : nums) {
                int hash = num % 10000 + 10000;
                if (arr[hash] != -10001) {
                    if (arr[hash] == num) return true;
                }
                arr[hash] = num;
            }
            return false;



        //        boolean result = false;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++)
//            if (nums[i] == nums[i + 1])
//                return true;
//        return result;
    }
}
