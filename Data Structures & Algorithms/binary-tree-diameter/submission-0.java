
class Solution {
    int diameter = 0;
    public int length(TreeNode root) {
        if(root == null) return 0;
        int LeftLongest = length(root.left);
        int RightLongest = length(root.right);
        diameter = Math.max(LeftLongest+RightLongest,diameter);
        return Math.max(LeftLongest,RightLongest)+1;
        }
    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return diameter;
    }
}