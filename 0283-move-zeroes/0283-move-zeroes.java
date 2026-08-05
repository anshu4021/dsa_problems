class Solution {
    public void moveZeroes(int[] nums) {
        
        int j = nums.length;
        int k =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[k];
                nums[k]=nums[i];
                nums[i]= temp;
                k++;
            }
        }
        
    }
}