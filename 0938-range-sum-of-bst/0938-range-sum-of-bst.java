class Solution {
    public int rangeSumBST(TreeNode root, int l, int h) {
        if(root == null) return 0;
        if(root.val < l)return  rangeSumBST(root.right , l , h);
        else if(root.val > h) return rangeSumBST(root.left , l , h);
        else return root.val + rangeSumBST(root.left , l , h) + rangeSumBST(root.right , l , h);
    }
}