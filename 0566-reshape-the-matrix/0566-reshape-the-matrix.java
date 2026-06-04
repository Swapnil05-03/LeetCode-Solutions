class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length ; int n = mat[0].length;
        int[][] ans = new int[r][c];
        int ele = m * n ; //total elements in mat
        int newEle = r * c;
        if(ele != newEle) return mat;
        else{
            for (int i = 0; i < m * n; i++) {
                ans[i / c][i % c] = mat[i / n][i % n];
            }
        }
        return ans;
    }
}