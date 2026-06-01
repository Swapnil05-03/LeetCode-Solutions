class Solution {
    public int maxProduct(int n) {
        int ans = 0;
        while(n > 0){
            int d1 = n % 10;
            n /= 10;
            int temp = n;
            while(temp > 0){
                int d2 = temp % 10;
                ans = Math.max(ans , d1*d2);
                temp /= 10;
            }
        }
        return ans;
    }
}