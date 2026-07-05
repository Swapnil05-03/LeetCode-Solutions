class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        return dfs(root, root.val);
    }
    private int dfs(TreeNode root, int min) {
        if (root == null) return -1;
        if (root.val > min) return root.val;

        int left = dfs(root.left, min);
        int right = dfs(root.right, min);

        if (left == -1) return right;
        if (right == -1) return left;
        return Math.min(left, right);
    }
}