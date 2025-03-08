import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {

  /**
   * 
   * Recursion
   * 
   */

  /**
   * 
   * Given the root of a binary tree, return the inorder traversal of its nodes'
   * values.
   * 
   * an inorder traversal first visits the:
   * left subtree -> root -> right subtree
   * 
   */
  public List<Integer> inorderTraversal(TreeNode root) {
    Stack<TreeNode> s = new Stack<>();
    List<Integer> trav = new ArrayList<>();

    // base case: empty array
    if (root == null) {
      return trav;
    }

    // base case: no left or right value, so only root
    if (root.left == null && root.right == null) {
      trav.add(root.val);
      return trav;
    }

    TreeNode curr = root;

    // while we still have more to traverse
    while (curr != null || !s.isEmpty()) {
      while (curr != null) {
        s.push(curr);
        curr = curr.left;
      }
      curr = s.pop();
      trav.add(curr.val);
      curr = curr.right;
    }

    return trav;
  }

  /**
   * 
   * Solution with DFS
   * 
   */

  public List<Integer> inorderTraversal_dfs(TreeNode root) {
    List<Integer> trav = new ArrayList<>();
    dfs(trav, root);
    return trav;
  }

  public void dfs(List<Integer> trav, TreeNode curr) {
    if (curr != null) {
      // we check the left subtree first
      if (curr.left != null)
        dfs(trav, curr.left);

      trav.add(curr.val);

      if (curr.right != null)
        dfs(trav, curr.right);
    }
  }
}