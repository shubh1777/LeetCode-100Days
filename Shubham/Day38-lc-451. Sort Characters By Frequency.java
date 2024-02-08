class Solution {
    public String frequencySort(String s) {
     HashMap<Character,Integer> mp=new HashMap<>();
     TreeMap<Integer,List<Character>> tmp=new TreeMap<>(Collections.reverseOrder());
     StringBuilder ans=new StringBuilder();

     for(char c:s.toCharArray()){
         mp.put(c,mp.getOrDefault(c,0)+1);
     }

     for(Map.Entry<Character,Integer> entry: mp.entrySet()){
         if(!tmp.containsKey(entry.getValue())){
             tmp.put(entry.getValue(),new ArrayList<>());
         }
        
             tmp.get(entry.getValue()).add(entry.getKey());
        
     }
     for(Map.Entry<Integer,List<Character>> entry: tmp.entrySet()){
         int freq=entry.getKey();
         List<Character> chars=entry.getValue();
         for(char c: chars){
             for(int i=0;i<freq;i++){
                ans.append(c); 
             }
         }
     }
     return ans.toString();

    }
}