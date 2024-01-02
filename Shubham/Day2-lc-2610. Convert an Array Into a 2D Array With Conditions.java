class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans=new List<>();
        int n_row=0;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int x: nums){
            if(!freq.contains(x)){
                freq.put(x,1);
            }
            else{
                freq.put(x,freq.get(x)+1);
            }
            n_row=Math.max(n_row,Freq.get(x));
        }
        
        int len=nums.length-1;
        
    }
}