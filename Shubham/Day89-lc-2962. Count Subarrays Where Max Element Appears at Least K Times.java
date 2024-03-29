class Solution {
    public long countSubarrays(int[] nums, int k) {
      int n=nums.length;
      int s=0,e=0;
      long ans=0;
      long max=0;
      for(int i=0;i<n;i++){
        max=Math.max(max,nums[i]);
      }
      while(e<n){
        if(nums[e]==max){
            k--;
        }
        e++;
        while(k==0){
            if(nums[s]==max){
                k++;
            }
            s++;
        }
        ans += s;
      } 
      return ans;  
    }
}
