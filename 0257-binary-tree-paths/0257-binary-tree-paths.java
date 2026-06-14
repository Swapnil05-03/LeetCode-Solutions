class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root , "" , ans);
        return ans;        
    }
    private static void dfs(TreeNode root , String st , List<String> ans){
        if(root == null) return;
        st += root.val;
        if(root.left == null && root.right == null){
            ans.add(st);
            return;
        }
        st += "->";
        dfs(root.left , st , ans);
        dfs(root.right , st , ans);
    }
}