import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int ind = 0;
        int ind2 = 0;
        for(int x : nums){
            if((ind=Arrays.binarySearch(nums,ind, nums.length, target-x))>=0)
            {
                if (Arrays.binarySearch(nums, x)!=ind) {
                    ind2 = Arrays.binarySearch(nums, x);
                    break;
                }
            }
          }
        return new int[]{ind,ind2};

    }
}
