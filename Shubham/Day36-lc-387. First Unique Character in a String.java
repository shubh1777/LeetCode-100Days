class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> mp=new HashMap<>();
       
           for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        
        // Find the first unique character
        for (int i = 0; i < s.length(); ++i) {
            if (mp.get(s.charAt(i)) == 1) {
                return i;
            }
        }
       
       return -1;
    }
}