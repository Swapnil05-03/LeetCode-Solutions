class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int maxG = 0;
        for(int ele : lights){
            maxG = Math.max(maxG , ele);
        }
        int ans = 0;
        for(int t : arrivalTime){
            int r = t % period;
            int wait;
            if(r < maxG) wait = 0;
            else wait = period - r;
            ans = Math.max(ans , wait);
        }
        return ans;
    }
}