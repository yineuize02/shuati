package com.fml.shuati;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;

/** https://leetcode-cn.com/problems/symmetric-tree/ */
public class SymmetricTree {
  public boolean isSymmetric(TreeNode root) {

    return compare(root.left, root.right);
  }

  public boolean compare(TreeNode left, TreeNode right) {

    if (left == null && right == null) {
      return true;
    }

    if (left != null && right == null) {
      return false;
    }

    if (right != null && left == null) {
      return false;
    }

    if (left.val != right.val) {
      return false;
    }

    var cl = compare(left.left, right.right);
    var cr = compare(left.right, right.left);

    return cl && cr;
  }
}
