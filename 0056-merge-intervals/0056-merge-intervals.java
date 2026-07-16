class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[] current = intervals[0];
        ans.add(current);
        for(int i=1;i<intervals.length;i++){
            if(current[1]>=intervals[i][0]){
                current[1]=Math.max(current[1],intervals[i][1]);

            }else{
                ans.add(intervals[i]);
                current = intervals[i];
            }
        } 
        return ans.toArray(new int[ans.size()][]);
    }
}