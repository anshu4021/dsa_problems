class Solution {
    public int totalFruit(int[] fruits) {
        int low =0;
        int n = fruits.length;
        int result = -5;
      HashMap<Integer,Integer> map = new HashMap<>();
        for(int high =0;high<n;high++){
           int j = fruits[high];
           map.put(j,map.getOrDefault(j,0)+1);
         if(map.size()>2){
            int rem = fruits[low];
            map.put(rem,map.get(rem)-1);
            if(map.get(rem)==0){
                map.remove(rem);
            }low++;
         }
         if(map.size()<2 || map.size()==2){
            result = Math.max(result,high-low+1);
         }

        }return result;
    }
}