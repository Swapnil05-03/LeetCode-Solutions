class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37]; 
        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            count[sum]++;
        }
        int maxSize = 0;
        for (int freq : count) {
            maxSize = Math.max(maxSize, freq);
        }
        int ans = 0;
        for (int freq : count) {
            if (freq == maxSize) {
                ans++;
            }
        }
        return ans;
    }
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}