class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();

        int m = arr.length , n = arr[0].length;
        int fR = 0 , lR = m-1 , fC = 0 , lC = n-1;
        while(fR <= lR && fC <= lC){
            //right
            for (int j = fC; j <= lC; j++)
                ans.add(arr[fR][j]);
            fR++;
            if(fR > lR || fC > lC)  break;
            //down
            for (int i = fR; i <= lR; i++)
                ans.add(arr[i][lC]);
            lC--;
            if (fR > lR || fC > lC)  break;
            //left
            for (int j = lC; j >= fC; j--)
                ans.add(arr[lR][j]);
            lR--;
            if (fR > lR || fC > lC)  break;
            //up
            for (int i = lR; i >= fR; i--)
                ans.add(arr[i][fC]);
            fC++;
            if (fR > lR || fC > lC)  break;
        }
        return ans;
    }
}