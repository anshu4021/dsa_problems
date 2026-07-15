class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count = 0;
        int[] prefixSum = new int[nums.length];
        prefixSum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i] = prefixSum[i-1]+ nums[i];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int j = 0;j<nums.length;j++){
            if(prefixSum[j]%k==0){
                count++;
            }
            int val = prefixSum[j]%k;
            if(val<0){
                val+=k;
            }
        
            if(map.containsKey(val)){
                count += map.get(val);
            }

            map.put(val, map.getOrDefault(val, 0) + 1);
        }return count;
    }
}