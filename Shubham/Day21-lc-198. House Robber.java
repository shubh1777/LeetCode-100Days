class Solution {
    public int rob(int[] nums) {
      if (nums.length == 1){
          return nums[0];
      }
      int[] max_val = new int[nums.length];
      max_val[0] = nums[0];
      max_val[1] = Math.max(nums[0], nums[1]);
      for (int i = 2; i < nums.length; i++){
          max_val[i] = Math.max(max_val[i - 1], max_val[i - 2] + nums[i]);
      }
      return max_val[nums.length -1];
      // int[][] dp=new int[nums.length][2];
      // int sum=0;
      // for(int i=0;i<nums.length;i++){
      //   dp[i][0]=i;
      //   dp[i][1]=nums[i];
      // }
      // if(nums.length < 3){
      //  for(int i=0;i<nums.length;i++){
      //    sum=Math.max(sum,nums[i]);
      //  }
      //  return sum;
      // }
      // Arrays.sort(dp,Comparator.comparingDouble(o->o[1]));
      // for(int j=nums.length-1;j>=0;j--){
      //      if(dp[j][0]%2==0){
      //        sum+=dp[j][1];
      //      }
      // }
      // return sum;
    }
}