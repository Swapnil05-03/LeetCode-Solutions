// class Solution {
//     public int findGCD(int[] nums) {
//         int min = nums[0];
//         int max = nums[0];
        
//         for (int num : nums) {
//             min = Math.min(min, num);
//             max = Math.max(max, num);
//         }
        
//         return gcd(min, max);
//     }
    
//     private int gcd(int a, int b) {
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         return a;
//     }
// }

//OR

class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }

        // simple gcd (loop wala)
        for (int i = min; i >= 1; i--) {
            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }

        return 1;
    }
}