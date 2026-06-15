// class Solution {
//     public void dfs(ArrayList<Integer> arr , TreeNode root){
//         if(root == null) return;
//         dfs(arr , root.left);
//         dfs(arr , root.right);
//         arr.add(root.val);
//     }
//     public List<Integer> postorderTraversal(TreeNode root) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         dfs(arr , root);
//         return arr;   
//     }
// }

//OR  (Iterative Approach)

class Solution {
    public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return ans;
        st.push(root);
        while(st.size() > 0){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.left != null) st.push(top.left);
            if(top.right != null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}