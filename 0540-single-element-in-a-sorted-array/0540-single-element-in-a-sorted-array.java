class Solution {
    public int singleNonDuplicate(int[] nums) {
       int low = 0;
       int high = nums.length-1;
       int ans = -1;
       if(nums.length==1){
        return nums[0];
       }
       while(low < high){
         int mid = low+(high-low)/2;
         if(mid%2==0 && nums[mid]==nums[mid+1] || mid%2==1 && nums[mid]==nums[mid-1]){
            low = mid+1;;
         }else{
                 ans = nums[mid];
                 high = mid;
         }
       }
       return nums[high];
    }
}