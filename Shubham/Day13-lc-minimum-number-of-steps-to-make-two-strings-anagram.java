public class Solution {
    public int minSteps(String s, String t) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for (char ch : s.toCharArray()) {
            c1[ch - 'a']++;
        }

        for (char ch : t.toCharArray()) {
            c2[ch - 'a']++;
        }

        int ans=0;
        for (int i = 0; i < 26; i++) {
            ans += Math.abs(c1[i] - c2[i]);
        }

        return ans / 2;  
    }
}