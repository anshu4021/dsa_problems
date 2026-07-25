class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return nums[low];
    }
}



/*class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;

        // Already sorted
        if (nums[0] <= nums[n - 1]) {
            return nums[0];
        }
        int low  = 0;
        int high = nums.length-1;
        int k = -1;
         while(low<=high){
            int mid = low + (high - low) / 2;

            if (mid < n - 1 && nums[mid] > nums[mid + 1]) {
                k = mid;
                break;
            }

            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
         }
    reverse(nums, 0, k);
reverse(nums, k + 1, n - 1);
reverse(nums, 0, n - 1);
         
        return nums[0];
    }
        void reverse(int[] nums,int start ,int end ){
         
          while(start<end){
            int temp = nums[start] ;
            nums[start] = nums[end] ;
            nums[end] = temp;
            start++;
            end --;
          }
      }
}*/