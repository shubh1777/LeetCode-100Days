class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(a,b)->{
        if(a[0]==b[0]){
            return Integer.compare(a[1],b[1]);
        }
        return Integer.compare(a[0],b[0]);
       });
       int c=0;
       long prev=points[0][1];
       for(int i=1;i<points.length;i++){
            if(prev>=points[i][0]){
                if(prev>points[i][1]){
                    prev=points[i][1];
                }
            }
            else{
                prev=points[i][1];
                c++;
            }
       }
       return c+1;
    }
}
     
