class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null; 

        if(root == p || root == q) return root; 

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) return root;
        return left != null ? left : right;


        
    }
}
//OR

//TLE aayega(due to recursion)

// class Solution {
//     public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//         if(root == null) return null;
//         if(root == p || root == q) return root;
//         boolean pLiesInLeft = exists(root.left , p);
//         boolean qLiesInRight = exists(root.right , q);
//         if(pLiesInLeft && !qLiesInRight) return lowestCommonAncestor(root.left , p ,q);
//         else if(!pLiesInLeft && qLiesInRight) return lowestCommonAncestor(root.right , p ,q);
//         else return root;
//     }
//     private boolean exists(TreeNode root , TreeNode val){
//         if(root == null) return false;
//         if(root == val) return true;
//         return exists(root.left , val) || exists(root.right , val);
//     }
// }