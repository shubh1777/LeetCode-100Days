class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> mp=new HashMap<>();
       int ans=0;
       int freq=-1;
       int maxfreq=-1;
       for(int i=0;i<nums.length;i++){
           if(!mp.containsKey(nums[i])){
               mp.put(nums[i],0);
           }
           else{
               mp.put(nums[i],mp.get(nums[i])+1);
           }
       }
       for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
             freq=entry.getValue();
             if(freq>maxfreq){
                 maxfreq=freq;
                 ans=entry.getKey();
             }
       }
       return ans;
    }
}

//Solution using HashMap

class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> mp=new HashMap<>();
       int ans=0;
       int freq=-1;
       int maxfreq=-1;
       for(int i=0;i<nums.length;i++){
           if(!mp.containsKey(nums[i])){
               mp.put(nums[i],0);
           }
           else{
               mp.put(nums[i],mp.get(nums[i])+1);
           }
       }
       for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
             freq=entry.getValue();
             if(freq>maxfreq){
                 maxfreq=freq;
                 ans=entry.getKey();
             }
       }
       return ans;
    }
}
