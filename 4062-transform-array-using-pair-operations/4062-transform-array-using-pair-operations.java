class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sum1 = 0;
        long sum2 = 0;
        for(int ele : source){
            sum1 += ele;
        }
        for(int ele : target){
            sum2 += ele;
        }
        return sum1 == sum2;
    }
}