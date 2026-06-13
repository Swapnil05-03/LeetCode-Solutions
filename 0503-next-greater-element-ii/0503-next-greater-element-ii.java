class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i>=0; i--){
            st.push(nums[i]);
        }
        for(int i = n-1; i>=0; i--){ 
            while(st.size() > 0 && nums[i] >= st.peek()) st.pop();
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return nge;
    }
}