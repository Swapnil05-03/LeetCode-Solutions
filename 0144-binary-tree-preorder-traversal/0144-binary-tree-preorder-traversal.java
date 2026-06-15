// class Solution {
//     public void dfs(ArrayList<Integer> arr , TreeNode root){
//         if(root == null) return;
//         arr.add(root.val);
//         dfs(arr , root.left);
//         dfs(arr , root.right);
//     }
//     public List<Integer> preorderTraversal(TreeNode root) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         dfs(arr , root);
//         return arr;   
//     }
// }

//OR  (Iterative Approach)

class Solution {
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return ans;
        st.push(root);
        while(st.size() > 0){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.right != null) st.push(top.right);
            if(top.left != null) st.push(top.left);
        }
        return ans;
    }
}