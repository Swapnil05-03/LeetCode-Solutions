class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for (char c : text.toCharArray()) {
            freq[c - 'a']++;
        }
        int b = freq['b' - 'a'];
        int a = freq['a' - 'a'];
        int l = freq['l' - 'a'] / 2;  // "l" appears twice in "balloon"
        int o = freq['o' - 'a'] / 2;  // "o" appears twice in "balloon"
        int n = freq['n' - 'a'];
        return Math.min(Math.min(b, Math.min(a, Math.min(l, Math.min(o, n)))), Integer.MAX_VALUE);
    }
}