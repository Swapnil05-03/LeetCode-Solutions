class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
//n & (n - 1) har iteration mein rightmost set bit hata deta hai, isliye ye bit manipulation interviews mein bahut important trick hai.