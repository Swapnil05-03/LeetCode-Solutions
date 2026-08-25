class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        int temp = k;
        while (set.contains(temp)) {
            temp += k;
        }
        return temp;
    }
}