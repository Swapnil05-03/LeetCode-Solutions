class Solution {
    public boolean canConstruct(String s, String t) {
        int[] freq = new int[26];
        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            freq[idx]--;
            if (freq[idx] < 0) {
                return false;
            }
        }
        return true;
    }
}