// class Solution {
//     public int gcdOfOddEvenSums(int n) {
//         int oddSum = 0 , evenSum = 0;
//         for(int i = 1; i <= n ; i++){
//             oddSum += (2 * i - 1);
//             evenSum += (2 * i);

//         }
//         int ans = gcd(oddSum , evenSum);
//         return ans;
//     }
//     public int gcd(int a , int b){
//          while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }

//OR

class Solution {
    public int gcdOfOddEvenSums(int n) {
        return n;    
    }
}