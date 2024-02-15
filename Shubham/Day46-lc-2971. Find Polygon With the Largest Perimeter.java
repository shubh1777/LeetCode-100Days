class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum=0,maxPeri=-1;
        for(int i=0;i<nums.length;i++){
            if(i>=2 && sum>nums[i]){
                maxPeri=sum+nums[i];
            }
            sum+=nums[i];
        }
        return maxPeri;
    }
}
