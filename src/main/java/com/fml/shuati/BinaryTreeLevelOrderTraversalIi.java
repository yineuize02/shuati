package com.fml.shuati;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/ */
public class BinaryTreeLevelOrderTraversalIi {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {

    List<List<Integer>> result = new ArrayList<>();
    Queue<TreeNode> level = new LinkedList<>();
    if (root == null) {
      return result;
    }

    level.add(root);
    while (!level.isEmpty()) {
      var size = level.size();
      var levelList = new ArrayList<Integer>(size);
      for (int i = 0; i < size; ++i) {
        var node = level.poll();
        if (node == null) {
          continue;
        }

        levelList.add(node.val);
        if (node.left != null) {
          level.add(node.left);
        }

        if (node.right != null) {
          level.add(node.right);
        }
      }

      result.add(levelList);
    }

    Collections.reverse(result);
    return result;
  }
}
