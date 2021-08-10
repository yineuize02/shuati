package com.fml.shuati;

import com.fml.shuati.utils.TreeNodeUtils.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** 层序遍历 https://leetcode-cn.com/problems/binary-tree-right-side-view/ */
public class BinaryTreeRightSideView {
  public List<Integer> rightSideView(TreeNode root) {
    if (root == null) {
      return List.of();
    }

    List<List<Integer>> resultLevels = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> level = new ArrayList<>();
      for (int i = 0; i < size; ++i) {
        var node = queue.poll();
        if (node == null) {
          continue;
        }

        level.add(node.val);
        if (node.left != null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }
      resultLevels.add(level);
    }

    List<Integer> result = new ArrayList<>();
    for (var list : resultLevels) {
      result.add(list.get(list.size() - 1));
    }

    return result;
  }
}
