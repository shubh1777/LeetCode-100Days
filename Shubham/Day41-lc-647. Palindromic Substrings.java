class Solution {
    public int countSubstrings(String s) {
       int ans=0;
       int n=s.length();
       for(int i=0;i<n;i++){
           for(int j=i;j<n;j++){
               if(isPali(s,i,j)){
                   ans++;
               }
           }
       } 
       return ans;
    }
    public boolean isPali(String s,int l,int r){
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }
}