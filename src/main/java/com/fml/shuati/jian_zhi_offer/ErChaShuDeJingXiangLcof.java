package com.fml.shuati.jian_zhi_offer;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;

/** https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/ */
public class ErChaShuDeJingXiangLcof {
  public TreeNode mirrorTree(TreeNode root) {

    if (root == null) {
      return null;
    }

    var left = root.right;
    var right = root.left;
    root.left = left;
    root.right = right;
    mirrorTree(root.left);
    mirrorTree(root.right);
    return root;
  }
}
