// class Solution {
//     public static void inorder(TreeNode root , ArrayList<TreeNode> arr){
//         if(root == null) return;
//         inorder(root.left , arr);
//         arr.add(root);
//         inorder(root.right , arr);
//     }
//     public TreeNode convertBST(TreeNode root) {
//         ArrayList<TreeNode> arr = new ArrayList<>();
//         inorder(root , arr);
//         Collections.reverse(arr);
//         int sum = 0;
//         for(int i = 0; i < arr.size() ; i++){
//             sum += arr.get(i).val;
//             arr.get(i).val = sum;
//         }
//         return root;
//     }
// }

//OR

// class Solution {
//     public static void revInorder(TreeNode root , ArrayList<TreeNode> arr){
//         if(root == null) return;
//         revInorder(root.right , arr);
//         arr.add(root);
//         revInorder(root.left , arr);
//     }
//     public TreeNode convertBST(TreeNode root) {
//         ArrayList<TreeNode> arr = new ArrayList<>();
//         revInorder(root , arr);
//         int sum = 0;
//         for(int i = 0; i < arr.size() ; i++){
//             sum += arr.get(i).val;
//             arr.get(i).val = sum;
//         }
//         return root;
//     }
// }

//OR

class Solution {
    static int sum;
    public static void revInorder(TreeNode root){
        if(root == null) return;
        revInorder(root.right); 
        int val = root.val;
        sum += val;
        root.val = sum;
        revInorder(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        revInorder(root);
        return root;
    }
}