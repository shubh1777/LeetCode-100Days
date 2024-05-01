class Solution {
    public long wonderfulSubstrings(String word) {
        int[] count = new int[1024]; // 2^10 to store bitmask frequencies
        count[0] = 1;
        long result = 0;
        int bitmask = 0;

        for (char ch : word.toCharArray()) {
            int charIndex = ch - 'a';
            bitmask ^= 1 << charIndex;
            result += count[bitmask];
            for (int i = 0; i < 10; i++) {
                result += count[bitmask ^ (1 << i)];
            }
            count[bitmask]++;
        }

        return result;
    }
}

class Solution {
    public long wonderfulSubstrings(String word) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        long result = 0;
        int bitmask = 0;

        for (char ch : word.toCharArray()) {
            int charIndex = ch - 'a';
            bitmask ^= 1 << charIndex;
            result += count.getOrDefault(bitmask, 0);
            for (int i = 0; i < 10; i++) {
                result += count.getOrDefault(bitmask ^ (1 << i), 0);
            }
            count.put(bitmask, count.getOrDefault(bitmask, 0) + 1);
        }

        return result;
    }
}

class Solution {
    public long wonderfulSubstrings(String word) {
        long[] count = new long[1024]; // 2^10 to store XOR values
        long result = 0;
        int prefixXor = 0;
        count[prefixXor] = 1;

        for (char ch : word.toCharArray()) {
            int charIndex = ch - 'a';
            prefixXor ^= 1 << charIndex;
            result += count[prefixXor];
            for (int i = 0; i < 10; i++) {
                result += count[prefixXor ^ (1 << i)];
            }
            count[prefixXor]++;
        }

        return result;
    }
}
