class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left; i <=right; i++){
            if(isSelfDividing(i)) ans.add(i);
        }
        return ans;
    }
    public boolean isSelfDividing(int nums){
        int temp = nums;
        while(temp > 0){
            int ld = temp % 10;
            if(ld == 0 || nums % ld != 0) return false;
            temp /= 10;
        }
        return true;
    }
}