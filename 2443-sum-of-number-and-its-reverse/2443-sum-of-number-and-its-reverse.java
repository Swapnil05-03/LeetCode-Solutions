class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int x = 0; x <= num; x++){
            if(x+reverse(x) == num){
                return true;
            }
        }
        return false;
    }
    public int reverse(int n){
        int rev = 0;
        while(n > 0){
            int ld = n % 10;
            rev = rev*10 + ld;
            n /= 10;
        }
        return rev;
    }
}