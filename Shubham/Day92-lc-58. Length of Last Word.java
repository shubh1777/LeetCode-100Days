class Solution {
    public int lengthOfLastWord(String s) {
        String st=s.trim();
       int n=st.length();
       int ans=0;
       for(int i=n-1;i>=0;i--){
           if(st.charAt(i)==' '){
               break;
           }{
             ans++;
           }
       }
       return ans; 
    }
}
