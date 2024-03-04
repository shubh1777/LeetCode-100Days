class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int count=0;
        int m=0;
        int s=0;
        int e=tokens.length-1;
        while(s<=e){
            if(power>=tokens[s]){
                power-=tokens[s];
                s++;
                count++;
                m=Math.max(m,count);
            }
            else if(count>0){
                power+=tokens[e];
                e--;
                count--;
                
            }
            else{
                break;
            }
        }
        return m; 
    }
}
