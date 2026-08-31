class Solution {
    public int countSpecialIntegers(int[] nums) {
        int[] freq = new int[101];
        int[] first = new int[101];
        int[] last = new int[101];

        Arrays.fill(first , -1);
        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            freq[x]++;
            if(first[x] == -1) first[x] = i;
            last[x] = i;
        }
        int ans = 0;
        for(int i =1; i <= 100; i++){
            if(freq[i] > 0 && last[i] - first[i] + 1 == freq[i]) ans++;
        }
        return ans;
    }
}