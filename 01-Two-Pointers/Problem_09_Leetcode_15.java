//  3Sum
// Leetcode 15
// level medium
// Time complexity  o(n*n)
// space complexity  0(1)
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate i

            int low = i + 1, high = nums.length - 1;
            int target = -nums[i];

            while (low < high) {
                int sum = nums[low] + nums[high];

                if (sum == target) {
                    ans.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    // skip duplicates for low
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    // skip duplicates for high
                    while (low < high && nums[high] == nums[high - 1]) high--;

                    low++;
                    high--;
                } else if (sum > target) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return ans;
    }
}