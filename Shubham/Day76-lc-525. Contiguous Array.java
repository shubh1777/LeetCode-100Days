class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        int sum=0;
        int max=0;
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(mp.containsKey(sum)){
                int last=mp.get(sum);
                max=Math.max(max,i-last);
            }else{
                mp.put(sum,i);
            }
        }
        return max;
    }
}
