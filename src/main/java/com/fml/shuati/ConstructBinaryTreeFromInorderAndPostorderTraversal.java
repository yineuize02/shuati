package com.fml.shuati;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;
import java.util.Arrays;

/** https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/ */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

  public static void main(String[] args) {
    //
    buildTree(new int[] {9, 3, 15, 20, 7}, new int[] {9, 15, 7, 20, 3});
    buildTree(new int[] {2, 1}, new int[] {1, 2});
    buildTree(new int[] {1, 2}, new int[] {1, 2});
  }

  public static TreeNode buildTree(int[] inorder, int[] postorder) {

    if (inorder == null || inorder.length == 0) {
      return null;
    }

    TreeNode root = new TreeNode();
    root.val = postorder[postorder.length - 1];

    if (postorder.length == 1) {
      return root;
    }

    int idxInorder = indexOf(root.val, inorder);
    int[] leftInorder = Arrays.copyOfRange(inorder, 0, idxInorder);
    int[] rightInorder = Arrays.copyOfRange(inorder, idxInorder + 1, inorder.length);

    int[] lPostOrder = Arrays.copyOfRange(postorder, 0, leftInorder.length);
    int[] rPostOrder = Arrays.copyOfRange(postorder, leftInorder.length, postorder.length - 1);
    root.left = buildTree(leftInorder, lPostOrder);
    root.right = buildTree(rightInorder, rPostOrder);

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
