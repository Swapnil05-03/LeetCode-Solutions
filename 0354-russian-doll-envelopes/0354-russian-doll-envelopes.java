class Solution {
    public int maxEnvelopes(int[][] arr) {
        Arrays.sort(arr, (a, b) -> (a[0] != b[0]) ? Integer.compare(a[0], b[0]) : Integer.compare(b[1], a[1]));
        ArrayList<Integer> ans = new ArrayList<>();
        for(int[] a : arr){
            int ele = a[1];
            if(ans.size() == 0 || ele > ans.get(ans.size()-1)) ans.add(ele);
            else replace(ele , ans);
        }
        return ans.size();
    }
    public void replace(int ele , ArrayList<Integer> ans){
        int lo = 0 , hi = ans.size()-1 , lb = -1; //replace with lower bound
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(ans.get(mid) >= ele){
                lb = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        ans.set(lb , ele);
    }
}