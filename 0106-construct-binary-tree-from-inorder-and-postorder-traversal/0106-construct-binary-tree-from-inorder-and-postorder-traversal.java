class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0 , n-1 , 0 , n-1 , inorder , postorder);
    }

    public static TreeNode build(int postlo , int posthi , int inlo , int inhi ,int inorder[], int postorder[]) {
        if(postlo > posthi || inlo > inhi) return null;
        int val = postorder[posthi];
        TreeNode root = new TreeNode(val);
        int r = -1;
        for(int i=inlo ; i<=inhi; i++){
            if(inorder[i] == val){
                r = i;
                break;
            }
        }
        int cnt = r - inlo;
        root.left = build(postlo , postlo+cnt-1 , inlo , r-1 , inorder , postorder);
        root.right = build(postlo+cnt , posthi-1 , r+1 , inhi , inorder , postorder);
        return root;
    }
} 