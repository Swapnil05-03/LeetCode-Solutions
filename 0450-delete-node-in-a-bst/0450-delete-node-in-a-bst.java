class Solution {
    public TreeNode deleteNode(TreeNode root, int target) {
        if(root == null) return null;
        if(root.val > target) root.left = deleteNode(root.left , target);
        else if(root.val < target) root.right = deleteNode(root.right , target);
        else{ // root.val == target
            //Case 1 : (Leaf Node)
            if(root.right == null && root.left == null) return null;

            //Case 2 : (1 Child Node)
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;

            //Case 3 : (2 Child Node)
            TreeNode pred = root.left;
            while(pred.right != null) pred = pred.right;
            root.left = deleteNode(root.left , pred.val);
            pred.left = root.left;
            pred.right = root.right;
            return pred;
        }
        return root;
    }
}