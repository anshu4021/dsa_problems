class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int maxEnd = nums[0];
        int minSum = nums[0];
        int minEnd = nums[0];
        int sum = nums[0];
        for(int i = 1;i<nums.length;i++){
            sum +=nums[i];
            maxEnd = Math.max(maxEnd+nums[i],nums[i]);
            maxSum = Math.max(maxSum,maxEnd);
            minEnd = Math.min(minEnd+nums[i],nums[i]);
            minSum = Math.min(minEnd,minSum);
            
        }  if (maxSum < 0)
            return maxSum;

     
        return Math.max(maxSum, sum - minSum);
    }
}