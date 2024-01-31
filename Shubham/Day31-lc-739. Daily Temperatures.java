class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int[] result = new int[temperatures.length];
        Deque<Integer> s = new ArrayDeque<>();

        for (int i = temperatures.length - 1; i >= 0; --i) {
            int curTemp = temperatures[i];

            while (!s.isEmpty() && curTemp >= temperatures[s.peekLast()]) {
                s.pollLast();
            }

            if (!s.isEmpty()) {
                result[i] = s.peekLast() - i;
            }

            s.offerLast(i);
        }

        return result;
    }
}