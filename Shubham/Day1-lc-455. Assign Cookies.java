class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cl = s.length;
        if(cl == 0) {
            return 0;
        } 
        Arrays.sort(g);
        Arrays.sort(s);

        int ans = 0;
        int cookies = cl - 1;
        int child = g.length - 1;
        while(cookies >= 0 && child >=0){
            if(s[cookies] >= g[child]){
                ans++;
                cookies--;
                child--;
            }
            else{
                child--;
            }
        }

        return ans;
    }
}