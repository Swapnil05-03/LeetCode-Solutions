class Solution {
    public int minSwaps(int[] nums) {

        int n = nums.length;

        int ones = 0;
        for (int x : nums)
            if (x == 1)
                ones++;

        if (ones <= 1)
            return 0;

        int currOnes = 0;

        for (int i = 0; i < ones; i++)
            currOnes += nums[i];

        int maxOnes = currOnes;
        for (int i = ones; i < n + ones; i++) {

            currOnes -= nums[(i - ones) % n];
            currOnes += nums[i % n];

            maxOnes = Math.max(maxOnes, currOnes);
        }

        return ones - maxOnes;
    }
}