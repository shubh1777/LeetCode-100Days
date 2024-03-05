class Solution {
    public int minimumLength(String s) {
        int st=0;
        int e=s.length()-1;
        //int ans=0;
        while(st<e && s.charAt(st)==s.charAt(e)){
            char cmp=s.charAt(st);

            while(st<=e && s.charAt(st)==cmp){
                st++;
            }
            while(st<=e && s.charAt(e)==cmp){
                e--;
            }
        }
       return e-st+1; 
    }
}
