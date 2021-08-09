package com.fml.shuati;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** https://leetcode-cn.com/problems/binary-tree-level-order-traversal/ */
public class BinaryTreeLevelOrderTraversal {

  public List<List<Integer>> levelOrder(TreeNode root) {

    Queue<TreeNode> queue = new LinkedList<>();
    if (root != null) {
      queue.add(root);
    }

    List<List<Integer>> result = new ArrayList<>();
    while (!queue.isEmpty()) {

      var levelSize = queue.size();
      List<Integer> levelList = new ArrayList<>(levelSize);
      for (int i = 0; i < levelSize; ++i) {
        var node = queue.poll();
        if (node == null) {
          continue;
        }

        levelList.add(node.val);

        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }

      result.add(levelList);
    }

    return result;
  }
}
