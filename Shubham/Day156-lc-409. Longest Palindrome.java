class Solution {
    public int longestPalindrome(String s) {
        int oddC=0;
        int ans=0;
        int[] set=new int[128];
        for(Character ch:s.toCharArray()){
            if(set[ch]!=0){
                oddC--;
                ans+=2;
                set[ch]=0;
            }else{
                oddC++;
                set[ch]=1;
            }
        }
        if(oddC>0){
            ans+=1;
        }
        return ans;
        
    }
}
