package hundred_days_of_code.Day60;

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
class Solution {

    int cameras = 0;

    // 0 = NOT COVERED
    // 1 = HAS CAMERA
    // 2 = COVERED

    public int minCameraCover(TreeNode root) {

        if (dfs(root) == 0)
            cameras++;

        return cameras;
    }

    private int dfs(TreeNode node) {

        if (node == null)
            return 2;

        int left = dfs(node.left);
        int right = dfs(node.right);

        if (left == 0 || right == 0) {
            cameras++;
            return 1;
        }

        if (left == 1 || right == 1)
            return 2;

        return 0;
    }
}
