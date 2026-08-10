class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int low =0;
        HashSet<Integer> set = new HashSet<>();
        for(int high = 0;high<nums.length;high++){
            if(set.contains(nums[high])){
                return true;
            }
            set.add(nums[high]);
            if(set.size()>k){
                set.remove(nums[high-k]);
            }
        }return false;
    }
}


// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int slow = 0;
//         int fast = 0;
//             do{
//                 slow=nums[slow];
//                 fast=nums[nums[fast]];
//             }while(slow!=fast);

//             slow=nums[0];
//             while(slow!=fast){
//                 slow = nums[slow];
//                 fast = nums[fast];
                
//             }
//             if(slow==fast){
//                 return true;
//             }
//         return false;
//     }
// }