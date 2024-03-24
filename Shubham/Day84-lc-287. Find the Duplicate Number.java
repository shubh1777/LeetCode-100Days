class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] check = new boolean[nums.length];
    for (int num : nums) {
      if (check[num]) {
        return num;
      }
      check[num] = true;
    }
    return 0;
    }
}
