class Solution {
    public int[] rearrangeArray(int[] nums) {
      int  n= nums.length;
        int even =0 , odd =1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
                arr[even]=nums[i];
                even+=2;
            }else{
                arr[odd]=nums[i];
                odd+=2;
            }

        }return arr;
    }
}