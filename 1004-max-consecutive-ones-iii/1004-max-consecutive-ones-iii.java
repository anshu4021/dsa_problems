class Solution {
    public int longestOnes(int[] nums, int k) {

        int low = 0;
        int zeroCount = 0;
        int ans = 0;

        for (int high = 0; high < nums.length; high++) {

            // Agar current element 0 hai to zeroCount badhao
            if (nums[high] == 0) {
                zeroCount++;
            }

            // Agar k se zyada 0 ho gaye to window shrink karo
            while (zeroCount > k) {
                if (nums[low] == 0) {
                    zeroCount--;
                }
                low++;
            }

            // Valid window ka maximum length
            ans = Math.max(ans, high - low + 1);
        }

        return ans;
    }
}