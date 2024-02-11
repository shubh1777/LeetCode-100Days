class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int step=0;
        for(int i=0;i<n;i++){
            if(i>step){
                return false;
            }
            step=Math.max(step,i+nums[i]);
        }
        return true;
    }
}
