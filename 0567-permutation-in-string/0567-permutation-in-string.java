class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m > n) return false;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for(int i = 0; i < m; i++){
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }
        if(Arrays.equals(s1Freq , s2Freq)) return true;

        for(int i = m; i<n; i++){
            s2Freq[s2.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i-m) - 'a']--;
            if(Arrays.equals(s1Freq , s2Freq)) return true;  

        }
        return false;
    }
}