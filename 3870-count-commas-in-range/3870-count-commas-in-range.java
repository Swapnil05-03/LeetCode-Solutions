class Solution {
    public int countCommas(int n) {
        int ans = noOfDigits(n);
        if(ans < 4) return 0;
        else return n - 999;
    }
    public int noOfDigits(int n){
        int count = 0;
        while(n > 0){
            int ld = n % 10;
            count++;
            n /= 10;
        }
        return count;
    }
}