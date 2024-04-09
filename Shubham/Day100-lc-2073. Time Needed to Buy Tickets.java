import java.util.List;

public class Solution {
    public int timeRequiredToBuy(List<Integer> v, int k) {
        int n = v.size();
        int value = v.get(k);
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                t += Math.min(v.get(i), value);
            } else if (i == k) {
                t += value;
            } else {
                if (v.get(i) < value)
                    t += v.get(i);
                else
                    t += value - 1;
            }
        }
        return t;
    }
}
