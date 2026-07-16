class Solution {
    public int[] distributeCandies(int candies, int n) {
        int[] ans = new int[n];
        int give = 1;

        while (candies > 0) {
            for (int i = 0; i < n && candies > 0; i++) {
                if (candies < give) {
                    ans[i] += candies;
                    candies = 0;
                } else {
                    ans[i] += give;
                    candies -= give;
                }
                give++;
            }
        }
        return ans;
    }
}