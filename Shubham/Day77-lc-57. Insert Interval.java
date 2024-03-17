class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        for(int[] a:intervals){
            if(a[1]<newInterval[0]){
                ans.add(a);
            }else if(newInterval[1]<a[0]){
                ans.add(newInterval);
                newInterval=a;
            }else{
                newInterval[0]=Math.min(newInterval[0],a[0]);
                newInterval[1]=Math.max(newInterval[1],a[1]);
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}
