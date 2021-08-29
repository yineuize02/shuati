package com.fml.shuati.jian_zhi_offer;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;

/** https://leetcode-cn.com/problems/dui-cheng-de-er-cha-shu-lcof/ */
public class DuiChengDeErChaShuLcof {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }

    return check(root.left, root.right);
  }

  public boolean check(TreeNode a, TreeNode b) {
    if (a == null && b != null) {
      return false;
    }

    if (a != null && b == null) {
      return false;
    }

    if (a == null && b == null) {
      return true;
    }

    if (a.val != b.val) {
      return false;
    }

    return check(a.left, b.right) && check(a.right, b.left);
  }
}
