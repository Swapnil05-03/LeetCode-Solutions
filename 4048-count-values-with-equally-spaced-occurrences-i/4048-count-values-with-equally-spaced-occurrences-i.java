class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        int ans = 0;
        for(ArrayList<Integer> arr : map.values()){
            if(arr.size() == 3){
                int i1 = arr.get(0);
                int i2 = arr.get(1);
                int i3 = arr.get(2);
                if(i2-i1 == i3-i2) ans++;
            }
        }
        return ans;
    }
}