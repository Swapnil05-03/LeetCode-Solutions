class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0 , j = n - 1;
        int maxArea = 0;

        while (i < j) {
            int width = j - i;
            int currArea = width * Math.min(height[i], height[j]);

            maxArea = Math.max(maxArea, currArea);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxArea;
    }
}