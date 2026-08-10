class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int Sum = 0;
        double maxSum =Integer.MIN_VALUE;
        for(int high = 0;high<nums.length;high++){
            Sum+=nums[high];
               if((high - low + 1) == k)
            {       
                
                maxSum = Math.max(maxSum, Sum);
                Sum = Sum - nums[low];
                low++;
            }
        }double maxAvg = maxSum/k;
        return maxAvg;
    }
}