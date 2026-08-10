class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) 
    {
        int n = arr.length;

        int low = 0;
        int sum = 0;
        int windowCount = 0;

        for(int high= 0; high < n; high++)
        {   sum = sum + arr[high];

            int windowSize = high - low + 1;

            if(windowSize == k)
            {
                if(sum >= k * threshold)
                {
                    windowCount++;
                }
                
                sum = sum - arr[low];
                low++;
            }
        }
  
        return windowCount;
    }
}