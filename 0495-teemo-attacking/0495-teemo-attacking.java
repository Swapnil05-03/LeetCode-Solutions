// class Solution {
//     public int findPoisonedDuration(int[] timeSeries, int duration) {
//         int n = timeSeries.length;
//         int x;
//         HashSet<Integer> set = new HashSet<>();
//         if(duration == 0) return duration;
//         for(int i = 0; i<n; i++){
//             x = timeSeries[i] + duration - 1;
//             set.add(timeSeries[i]);
//             set.add(x);
//         }
//         return set.size();

        
//     }
// }

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        
        for (int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];
            total += Math.min(duration, gap);
        }
        
        return total + duration;
    }
}