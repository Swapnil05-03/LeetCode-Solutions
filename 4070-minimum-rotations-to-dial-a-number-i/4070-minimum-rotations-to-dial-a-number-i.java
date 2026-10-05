class Solution {
    public int minRotations(String s) {
        int ans = 0;
        int curr = 0;
        for(int i = 0; i < s.length(); i++){
            int next = s.charAt(i) - '0';
            int diff = Math.abs(curr - next);
            ans += Math.min(diff , 10-diff);
            curr = next;
        }
        return ans;
    }
}