// class Solution {
//     public void sortColors(int[] nums) {
//         int n = nums.length;
//         int lo = 0 , mid = 0 , hi = n-1;
//         while(mid<=hi){
//             if(nums[mid] == 0){
//                 int temp = nums[mid];
//                 nums[mid] = nums[lo];
//                 nums[lo] = temp;
//                 lo++;
//                 mid++;
//             }
//             else if(nums[mid] == 1){
//                 mid++;
//             }
//             else{
//                 int temp = nums[mid];
//                 nums[mid] = nums[hi];
//                 nums[hi] = temp;
//                 hi--;
//             }
//         }
//     }
// }

//OR

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count0 = 0 , count1 = 0 , count2 = 0;
        for(int ele : nums){
            if(ele == 0) count0++;
            else if(ele == 1) count1++;
            else count2++;
        }
        int i = 0;
        while(count0-- > 0) nums[i++] = 0;
        while(count1-- > 0) nums[i++] = 1;
        while(count2-- > 0) nums[i++] = 2;
    }
}