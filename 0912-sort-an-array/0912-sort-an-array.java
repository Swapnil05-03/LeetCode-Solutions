class Solution {
    public int[] sortArray(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for(int ele : arr){
            pq.add(ele);
        }
        while(pq.size() > 0) arr[idx++] = pq.remove();
        return arr;
    }
}