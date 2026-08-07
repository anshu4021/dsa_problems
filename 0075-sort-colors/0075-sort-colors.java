class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
      int low =0;
      int mid =0;
      int high =n-1;
      while(mid<=high){
        if(nums[mid]==0){
            int temp = nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;
        }else if(nums[mid]==2){
            int temp = nums[high];
            nums[high]=nums[mid];
            nums[mid]=temp;
            high--;
        }else{mid++;}
      }

    }
}

/*Initialize:
low = 0
mid = 0
high = n - 1

While (mid <= high)

    If nums[mid] == 0
        Swap(nums[low], nums[mid])
        low++
        mid++

    Else if nums[mid] == 1
        mid++

    Else (nums[mid] == 2)
        Swap(nums[mid], nums[high])
        high--
        // Do NOT increment mid as the new number can be 1 , 0 either example dry run 120

Return array*/