class Solution {
    public int findMaxK(int[] nums) {
      Arrays.sort(nums);
      int s=0,e=nums.length-1;
      int max=-1;
      while(s<e){
        int sum= nums[s]+nums[e];
        if(sum==0){
            max=Math.max(nums[e],max);
            s++;
            e--;
        }
        else if(sum<0){
            s++;
        }else{
            e--;
        }
      }
      return max;  
    }
}
