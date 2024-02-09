class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
       List<Integer> ans=new ArrayList<>();
       int[] dp=new int[n];
       
       Arrays.fill(dp,1);
      int maxsize=1, idx=0;
      for(int i=1;i<n;i++){
          for(int j=0;j<i;j++){
              if(nums[i]%nums[j]==0){
                  dp[i]=Math.max(dp[i],dp[j]+1);
                  if(dp[i]>maxsize){
                      maxsize=dp[i];
                      idx=i;
                  }
              }
          }
      }
    int num=nums[idx];
    for(int i=idx;i>=0;i--){
        if(num%nums[i]==0 && dp[i]==maxsize){
            ans.add(nums[i]);
            num=nums[i];
            maxsize--;
        }
    }
       
     return ans;
    }
}