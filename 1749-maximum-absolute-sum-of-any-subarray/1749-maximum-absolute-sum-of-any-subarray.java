class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minEnd = nums[0];
        int maxEnd = nums[0];
        int ans = Math.abs(nums[0]);
        for(int i = 1;i<nums.length;i++){
            minEnd = Math.min(minEnd+nums[i],nums[i]);
            maxEnd = Math.max(maxEnd+nums[i],nums[i]);
             ans = Math.max(ans,Math.max(Math.abs(maxEnd),Math.abs(minEnd)));
        }return ans;
    }
}