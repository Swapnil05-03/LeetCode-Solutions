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

class Solution {
    TreeNode prev = null;
     public boolean isValidBST(TreeNode root){
        if(root == null) return true;
        if(!isValidBST(root.left)) return false;
        if(prev != null && root.val <= prev.val) return false;
        prev = root;
        return isValidBST(root.right);
    }
}