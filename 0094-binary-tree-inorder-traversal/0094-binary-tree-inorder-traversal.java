//Morris Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                //find predecessor and do work
                TreeNode pred = curr.left;
                while(pred.right != null && pred.right != curr) pred = pred.right; 
                if(pred.right == null){
                    //link
                    pred.right = curr;
                    curr = curr.left;
                }
                else{ // pred.right == curr --> Unlink and print
                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                ans.add(curr.val);
                curr = curr.right;
            }
        } 
        return ans;
    }
}


//OR

// class Solution {
//     public void dfs(ArrayList<Integer> arr , TreeNode root){
//         if(root == null) return;
//         dfs(arr , root.left);
//         arr.add(root.val);
//         dfs(arr , root.right);
//     }
//     public List<Integer> inorderTraversal(TreeNode root) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         dfs(arr , root);
//         return arr;   
//     }
// }

//OR (Iterative Approach)

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> ans = new ArrayList<>();
//         Stack<TreeNode> st = new Stack<>();
//         TreeNode curr = root;
//         while (st.size() > 0 || curr != null) {
//             if (curr != null) {
//                 if (curr.left != null) {
//                     st.push(curr);
//                     curr = curr.left;
//                 } else {
//                     ans.add(curr.val);
//                     curr = curr.right;
//                 }
//             } else { // curr == null
//                 TreeNode top = st.pop();
//                 ans.add(top.val);
//                 curr = top.right;
//             }
//         }
//         return ans;
//     }
// }