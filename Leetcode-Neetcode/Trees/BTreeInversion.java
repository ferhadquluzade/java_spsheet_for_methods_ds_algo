// Problem: Invert binary tree
// Link: https://leetcode.com/problems/invert-binary-tree/

class BTreeInversion {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        else{
            TreeNode temp = root.right;
            root.right = root.left;
            root.left = temp;

            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}

