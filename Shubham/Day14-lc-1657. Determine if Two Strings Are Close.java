class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] c1 = new int[26];
        int[] c2 = new int[26];

        for (char ch : word1.toCharArray()) {
            c1[ch - 'a']++;
        }

        for (char ch : word2.toCharArray()) {
            c2[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if ((c1[i] == 0 && c2[i] != 0) || (c1[i] != 0 && c2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(c1);
        Arrays.sort(c2);

        for (int i = 0; i < 26; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }

        return true;
    }
}