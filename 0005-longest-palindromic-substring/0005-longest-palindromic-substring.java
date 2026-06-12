class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        int i = 0, j = 0;
        for (int k = 0; k < s.length(); k++) {
            int len1 = longest(s, k, k);       
            int len2 = longest(s, k, k + 1);   
            int len = Math.max(len1, len2);

            if (len > j - i + 1) {
                i = k - (len - 1) / 2;
                j = k + len / 2;
            }
        }
        return s.substring(i, j+1);
    }
    private int longest(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}