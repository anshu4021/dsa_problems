class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
       int low = 0;
        long sum = 0;
       long maxSum =0;
      HashSet<Integer> set = new HashSet<>();
       for(int high = 0;high<nums.length;high++){
            
            while (set.contains(nums[high])) {
                set.remove(nums[low]);
                sum = sum - nums[low];
                low++;
            }
            
            set.add(nums[high]);
            sum += nums[high];
            
            if (high - low + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                set.remove(nums[low]);
                sum -= nums[low];
                low++;
            }
       } return maxSum;
    }
}