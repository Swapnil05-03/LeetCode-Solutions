class Doublet implements Comparable<Doublet>{
    int diff;
    int y;
    Doublet(int diff , int y){
        this.diff = diff;
        this.y = y;
    }
    public int compareTo(Doublet d){
        if(this.diff == d.diff)
            return this.y - d.y; //agar difference equal hai toh bade element ko priority milegi

        return this.diff - d.diff; //choti differences ko priority milegi
    }
}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Doublet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            int diff = Math.abs(x - ele);
            int y = ele;
            pq.add(new Doublet(diff , y));
            if(pq.size() > k) pq.remove();
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < k; i++){
            Doublet top = pq.remove();
            ans.add(top.y);
        }
        Collections.sort(ans);
        return ans;
    }
}
