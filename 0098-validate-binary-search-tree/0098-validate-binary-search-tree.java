// class Solution {
//     public boolean isSorted(ArrayList<Integer> arr) {
//         for (int i = 1; i < arr.size(); i++) {
//             if (arr.get(i) <= arr.get(i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public void inorder(TreeNode root , ArrayList<Integer> arr){
//         if(root == null) return;
//         inorder(root.left , arr);
//         arr.add(root.val);
//         inorder(root.right , arr);
//     }
    
    
//     public boolean isValidBST(TreeNode root) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         inorder(root , arr);
//         boolean flag = isSorted(arr);
//         if(flag) return true;
//         else return false;
//     }
// }

//OR

// class Solution {
//     TreeNode prev = null;
//      public boolean isValidBST(TreeNode root){
//         if(root == null) return true;
//         if(!isValidBST(root.left)) return false;
//         if(prev != null && root.val <= prev.val) return false;
//         prev = root;
//         return isValidBST(root.right);
//     }
// }

//OR

class Pair{
    long max;
    long min;
    Pair(long max , long min){
        this.max = max;
        this.min = min;
    }
}
class Solution {
    static boolean flag;
    public boolean isValidBST(TreeNode root) {
        flag = true;
        maxMin(root);
        return flag;
    }
    Pair maxMin(TreeNode root){
        if(root == null) return new Pair(Long.MIN_VALUE, Long.MAX_VALUE);
        Pair lst = maxMin(root.left);
        Pair rst = maxMin(root.right);
        long mx = Math.max(root.val , Math.max(lst.max , rst.max));
        long mn = Math.min(root.val , Math.min(lst.min , rst.min));
        if(lst.max >= root.val || rst.min <= root.val) flag = false;
        return new Pair(mx , mn);
    }
}