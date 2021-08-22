package com.fml.shuati.jian_zhi_offer;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;

/** https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/ */
public class ZhongJianErChaShuLcof {

  public static void main(String[] args) {
    //

    buildTree(new int[] {9, 3, 15, 20, 7}, new int[] {9, 15, 7, 20, 3});
    buildTree(new int[] {2, 1}, new int[] {1, 2});
    buildTree(new int[] {1, 2}, new int[] {1, 2});
  }

  public static TreeNode buildTree(int[] preorder, int[] inorder) {
    var root = build(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    return root;
  }

  public static TreeNode build(
      int[] preorder, int[] inorder, int preS, int preEnd, int inorderS, int inorderEnd) {

    if (preS > preEnd || inorderS > inorderEnd) {
      return null;
    }

    var val = preorder[preS];
    TreeNode node = new TreeNode(val);
    int rootIdx = inorderS;
    int leftLength = 0;
    int rightLength = 0;
    for (int i = inorderS; i <= inorderEnd; ++i) {
      if (val == inorder[i]) {
        rootIdx = i;
        leftLength = rootIdx - inorderS;
        rightLength = inorderEnd - rootIdx;
      }
    }

    if (leftLength > 0) {
      node.left =
          build(preorder, inorder, preS + 1, preS + leftLength, rootIdx - leftLength, rootIdx - 1);
    }

    if (rightLength > 0) {
      node.right =
          build(
              preorder, inorder, preS + leftLength + 1, preEnd, rootIdx + 1, rootIdx + rightLength);
    }

    return node;
  }
}
