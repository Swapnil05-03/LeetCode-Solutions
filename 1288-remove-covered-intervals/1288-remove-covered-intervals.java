class Solution {
    public int removeCoveredIntervals(int[][] arr) {

        Arrays.sort(arr, (a, b) -> (a[0] != b[0]) ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1]));
        int count = 0;
        int maxEnd = -1;

        for (int[] ans : arr) {
            if (ans[1] > maxEnd) {
                count++;
                maxEnd = ans[1];
            }
        }
        return count;
    }
}