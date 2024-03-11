class Solution {
    public String customSortString(String order, String s) {
        StringBuilder ans=new StringBuilder();
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char a: s.toCharArray()){
            mp.put(a,mp.getOrDefault(a,0)+1);
        }
        for(char c:order.toCharArray()){
            if(mp.containsKey(c)){
                ans.append(String.valueOf(c).repeat(Math.max(0, mp.get(c))));
                mp.remove(c);
            }
        }
        for(char c:mp.keySet()){
            ans.append(String.valueOf(c).repeat(Math.max(0,mp.get(c))));
        }
        return ans.toString();
    }
}
        
