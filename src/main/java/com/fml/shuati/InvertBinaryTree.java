package com.fml.shuati;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;

/** https://leetcode-cn.com/problems/invert-binary-tree */
public class InvertBinaryTree {
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }

    var left = invertTree(root.left);
    var right = invertTree(root.right);
    root.left = right;
    root.right = left;

    return root;
  }
}
