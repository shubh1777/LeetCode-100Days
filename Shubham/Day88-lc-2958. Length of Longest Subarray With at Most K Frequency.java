class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        int i=0,j=0,ans=1;
        while(i<n && j<n){
            mp.put(nums[j],mp.getOrDefault(nums[j],0)+1);
            while(mp.get(nums[j])>k){
                mp.put(nums[i],mp.get(nums[i])-1);
                i++;
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}

      
