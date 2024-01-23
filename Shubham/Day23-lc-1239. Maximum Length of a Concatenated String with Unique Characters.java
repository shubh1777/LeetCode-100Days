class Solution {
    private int res=0;
    public int maxLength(List<String> arr) {
     if(arr==null || arr.size()==0){
         return 0;
     } 
     dfs(arr,"",0);
     return res;  
    }
    private void dfs(List<String> a,String path, int idx){
        boolean unqchar=isUnique(path);
        if(unqchar){
            res=Math.max(path.length(),res);
        }
        if(idx==a.size() || !unqchar){
            return;
        }
        for(int i=idx;i<a.size();i++){
            dfs(a,path+a.get(i),i+1);
        }
    }
    private boolean isUnique(String s){
        Set<Character> set =new HashSet<>();
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }
}