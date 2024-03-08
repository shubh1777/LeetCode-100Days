class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int ans=0;
        int maxf=0;
        for(int i=0;i<nums.length;i++){
             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int val:mp.values()){
            maxf=Math.max(maxf,val);
        }
        for(int val:mp.values()){
            if(val==maxf){
                ans+=maxf;
            }
        }
        return ans;

    }
}
