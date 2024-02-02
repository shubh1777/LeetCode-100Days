class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
         List<Integer> ans=new ArrayList<>();
        for (int i = 1; i <= 9; ++i) {
            int curDigit = i;
            int nextDigit = i + 1;

            while (curDigit <= high && nextDigit <= 9) {
                curDigit = curDigit * 10 + nextDigit;
                if (low <= curDigit && curDigit <= high) {
                    ans.add(curDigit);
                }
                ++nextDigit;
            }
        }

        ans.sort(null);
        return ans; 
    }
}