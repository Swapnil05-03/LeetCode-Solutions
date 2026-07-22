class Solution {
    public boolean isSameAfterReversals(int num) {
        int num1 = num;

        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        num = rev;
        rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev == num1;
    }
}