package com.fml.shuati;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;

/** https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/ */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

  public static void main(String[] args) {
    //

    buildTree(new int[] {9, 3, 15, 20, 7}, new int[] {9, 15, 7, 20, 3});
    buildTree(new int[] {2, 1}, new int[] {1, 2});
    buildTree(new int[] {1, 2}, new int[] {1, 2});
  }

  public static TreeNode buildTree(int[] preorder, int[] inorder) {

    var root = build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    return root;
  }

  public static TreeNode build(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {

    if (ps > pe || is > ie) {
      return null;
    }

    var root = new TreeNode(preorder[ps]);
    var idx = indexOf(preorder[ps], inorder);
    int sizeLeftSubtree = idx - is;

    root.left = build(preorder, ps + 1, ps + sizeLeftSubtree, inorder, is, idx - 1);
    root.right = build(preorder, ps + sizeLeftSubtree + 1, pe, inorder, idx + 1, ie);
    return root;
  }

  public static int indexOf(int val, int[] array) {
    for (int i = 0; i < array.length; ++i) {
      if (val == array[i]) {
        return i;
      }
    }

    return -1;
  }
}
