class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0; j < matrix[0].length; j++){
                arr.add(matrix[i][j]);
            }
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele); 
            if(pq.size() > k) pq.remove();
        }
        return pq.peek();
    }
}