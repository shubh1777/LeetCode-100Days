class Solution {
    public int pivotInteger(int n) {
        int ans=n*(n+1)/2;
        double a= Math.sqrt(ans);

        if( a- Math.ceil(a)==0) return (int)a;
        else return -1;
    }
}
