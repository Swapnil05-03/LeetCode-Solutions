class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();
        long ans = 0;
        int c = -1;
        for(int i = 0; i < n; i++){
            if(i >= 2 && s.charAt(i-2) == 'a' && s.charAt(i-1) == 'b' && s.charAt(i) == 'c'){
                c = i-2;
            }
            ans += i-c;
        }
        return ans;
    }
}