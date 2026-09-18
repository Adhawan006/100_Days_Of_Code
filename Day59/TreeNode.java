package hundred_days_of_code.Day59;
import java.util.*;

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

    int postIndex;
    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return helper(inorder, postorder, 0, inorder.length - 1);
    }

    TreeNode helper(int[] inorder, int[] postorder, int left, int right) {

        if (left > right)
            return null;

        int rootVal = postorder[postIndex--];

        TreeNode root = new TreeNode(rootVal);

        int mid = map.get(rootVal);

        root.right = helper(inorder, postorder, mid + 1, right);

        root.left = helper(inorder, postorder, left, mid - 1);

        return root;
    }
}
