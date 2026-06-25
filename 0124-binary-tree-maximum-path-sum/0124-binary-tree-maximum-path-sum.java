class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return ans;
    }
    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0 , dfs(root.left));
        int right = Math.max(0 , dfs(root.right));

        int currPath = root.val + left + right;
        ans = Math.max(ans , currPath);
        return root.val + Math.max(left , right);
    }
}