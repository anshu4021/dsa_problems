/*class Solution {
    public int subarraySum(int[] nums, int k) {
      int count = 0;
      for(int i = 0;i<nums.length;i++){
         int sum = 0;
        for(int j =i;j<nums.length;j++){
           
            sum +=nums[j];
            if(sum==k){
                count ++;
            }
        }
      }  return count;
    }
}*/
class Solution{
    public int subarraySum(int[] nums , int k){
       int count =0;
       //step 1 :calculate the prefix sum of i
       int[] prefixSum = new int[nums.length];
       prefixSum[0]=nums[0];
       for(int i = 1;i<nums.length;i++){
        prefixSum[i] = prefixSum[i-1] +nums[i];
       }
       HashMap<Integer,Integer> map = new HashMap<>();
       //step 2 count all the subarrays with sum =k
       for(int j=0;j<prefixSum.length;j++){
        if(prefixSum[j]==k){
            count++;
        }
        int val = prefixSum[j]-k;
        if(map.containsKey(val)){
            count += map.get(val);
        }
          map.put(prefixSum[j], map.getOrDefault(prefixSum[j], 0) + 1);
       }

return count;
    }
}