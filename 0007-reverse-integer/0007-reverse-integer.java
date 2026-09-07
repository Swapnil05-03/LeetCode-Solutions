class Solution {
    public int reverse(int n) {
        int rev = 0 , rem;
        while(n != 0){
            rem = n %10;
            // overflow check before multiplication
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10)
                return 0;
                
            rev = rem + rev*10;
            n /= 10;
        }
        return rev;
    }
}
