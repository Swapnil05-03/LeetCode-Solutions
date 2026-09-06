class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele , map.getOrDefault(ele , 0)+1);
        }
        int ans = 0;
        for(int ele : map.keySet()){
            if(map.containsKey(ele+1)){
                ans = Math.max(ans , map.get(ele) + map.get(ele+1));
            }
        }
        return ans;
    }
}