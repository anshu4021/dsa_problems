class Solution {
    public void sortColors(int[] nums) {
        int pos=0;
         for(int i =0;i<nums.length;i++){
            
            if(nums[i]==0){
                int temp = nums[pos];
                nums[pos]=nums[i];
                nums[i]= temp;
                pos++;
                
            }
        }
          for(int i =pos;i<nums.length;i++){
            
            if(nums[i]==1){
                int temp = nums[pos];
                nums[pos]=nums[i];
                nums[i]= temp;
                pos++;
                
            }
        }
    }

       
    }
