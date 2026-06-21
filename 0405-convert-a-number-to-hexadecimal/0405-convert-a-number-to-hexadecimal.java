class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        char[] hex = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        while (num != 0) {
            sb.insert(0, hex[num & 15]); // last 4 bits
            num >>>= 4;                  // unsigned right shift
        }
        return sb.toString();
    }
}