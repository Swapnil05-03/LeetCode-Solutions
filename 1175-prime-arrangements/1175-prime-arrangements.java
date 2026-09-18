class Solution {
    public int numPrimeArrangements(int n) {
        long MOD = 1000000007;
        int prime = 0;
        for(int i = 2; i <= n; i++){
            if(isPrime(i)) prime++;
        }
        int nonPrime = n - prime;
        long ans = 1;
        for (int i = 1; i <= prime; i++) {
            ans = (ans * i) % MOD;
        }
        for (int i = 1; i <= nonPrime; i++) {
            ans = (ans * i) % MOD;
        }
        return (int) ans;
    }
    private boolean isPrime(int n){
        if(n < 2) return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}