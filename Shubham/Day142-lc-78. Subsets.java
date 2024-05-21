class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
     findSub(nums,0,new ArrayList<>());
     return ans;   
    }
    public void findSub(int[] nums,int ind,List<Integer> sub){
        if(ind==nums.length){
            ans.add(new ArrayList<>(sub));
            return;
        }
        sub.add(nums[ind]);
        findSub(nums,ind+1,sub);
        sub.remove(sub.size()-1);
        findSub(nums,ind+1,sub);
    }
}
