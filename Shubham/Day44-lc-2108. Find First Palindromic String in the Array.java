class Solution {
    public String firstPalindrome(String[] words) {
          for(int i=0;i<words.length;i++){
              if(ispali(words[i])){
                  return words[i];
              }
          } 
          return ""; 
    }
    public boolean ispali(String s){
        int n=s.length()-1;
        int i=0;

        while(i<n){
            if(s.charAt(i++)!=s.charAt(n--)){
                return false;
            }
        }
        return true;
    }
}
