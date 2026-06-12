class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean reverse = false;
        while(!q.isEmpty()) {

            int size = q.size();
            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++) {
                TreeNode front = q.remove();
                level.add(front.val);

                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            if(reverse) {
                Collections.reverse(level);
            }
            ans.add(level);
            reverse = !reverse;
        }
        return ans;
    }
}