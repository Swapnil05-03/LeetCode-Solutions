class Solution {
    public double champagneTower(int N, int query_row, int query_glass) {
        double[][] a = new double[query_row + 2][query_row + 2];
        a[0][0] = N;
        for (int r = 0; r <= query_row; r++) {
            for (int c = 0; c <= r; c++) {
                if (a[r][c] > 1) {
                    double temp = a[r][c] - 1;
                    a[r][c] = 1;
                    a[r + 1][c] += temp / 2;
                    a[r + 1][c + 1] += temp / 2;
                }
            }
        }
        return Math.min(1, a[query_row][query_glass]);
    }
}