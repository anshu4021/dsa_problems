class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for(int high = 0;high<s.length();high++){
            char ch = s.charAt(high);
          
            while(set.contains(ch)){
                char hc = s.charAt(low);
                set.remove(hc);
                low++;
            }
            set.add(ch);
         if(set.size()==high-low+1){
           res = Math.max(res,high-low+1);
           } }
        return res;
    }
}

