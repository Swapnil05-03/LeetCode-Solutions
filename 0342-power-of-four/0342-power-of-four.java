class Solution {
    boolean isPowerOfTwo(int n){
        return (n > 0 && (n & (n-1)) == 0);
    }
    boolean isSorted(int n){
        long root = (long)(Math.sqrt(n));
        return (root * root == n);
    }
    public boolean isPowerOfFour(int n) {
        return (isPowerOfTwo(n) && isSorted(n));
    }
}