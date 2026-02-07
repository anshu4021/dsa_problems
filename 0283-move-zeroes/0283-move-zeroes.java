/*class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length ;
        int pos = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
               int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i]= temp;
                pos++;
            }
            
        }
    }
}*/
class Solution {
    public void moveZeroes(int[] nums) {
       int n = nums.length ;
        int pos = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
                nums[pos] = nums[i];
                pos++;
            }
            
        }for(int i =pos;i<n;i++){
                nums[i]=0;
            }
    }
}