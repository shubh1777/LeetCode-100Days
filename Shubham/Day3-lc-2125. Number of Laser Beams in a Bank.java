class Solution {
    public int numberOfBeams(String[] bank) {
      int prev_one_count=0;
      int ans=0;
      for(String s: bank){
          int cur_one_count=0;
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='1'){
                  cur_one_count++;

              }
          }
          if(cur_one_count>0){
              ans += cur_one_count * prev_one_count;
              prev_one_count=cur_one_count;
          }
      }
      return ans;  
    }
}