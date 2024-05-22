class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        helper(s,0,new ArrayList<>());
        return ans;
    }
    public boolean isPal(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public void helper(String s,int ind,List<String> sub){
        if(ind==s.length()){
            ans.add(new ArrayList<>(sub));
            return;
        }
        for(int i=ind;i<s.length();i++){
            if(isPal(s,ind,i)){
                sub.add(s.substring(ind,i+1));
                helper(s,i+1,sub);
                sub.remove(sub.size()-1);
            }
        }
    }
}
