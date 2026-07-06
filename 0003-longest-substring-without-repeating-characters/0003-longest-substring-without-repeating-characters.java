class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int res = 0;
        int n = s.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int high = 0 ;high <n;high++){
            
            char ch =s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()<high-low+1){
              char rem = s.charAt(low);
              map.put(rem,map.get(rem)-1);
              if(map.get(rem)==0)
              map.remove(rem);
              low++;
            }
           if(map.size()==high-low+1){
            res = Math.max(res,high-low+1);
           } 
        }
   return res;
    }
}