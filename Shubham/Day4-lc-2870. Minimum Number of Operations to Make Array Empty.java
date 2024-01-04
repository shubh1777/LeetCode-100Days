class Solution {
    public int minOperations(int[] nums) {
       int ans=0;
       Map<Integer,Integer> mp=new HashMap<>();
       for(int n:nums){
          
              mp.put(n,mp.getOrDefault(n,0)+1);
          
       }
       for(Map.Entry<Integer,Integer> en: mp.entrySet()){
           int freq= en.getValue();
           if(freq== 1){
               return -1;
           }
           ans += freq/3;
           if(freq%3 != 0){
               ans++;
           }
       }
       return ans;
    }
}