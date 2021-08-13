package com.fml.shuati;

import com.fml.shuati.utils.ListNodeUtils;
import com.fml.shuati.utils.ListNodeUtils.ListNode;
import java.util.List;

/** https://leetcode-cn.com/problems/merge-two-sorted-lists/ */
public class MergeTwoSortedLists {

  public static void main(String[] args) {

    System.out.println(
        ListNodeUtils.printList(
            mergeTwoLists(
                ListNodeUtils.createFromList(List.of(1, 2, 4)),
                ListNodeUtils.createFromList(List.of(1, 3, 4)))));
    System.out.println(
        ListNodeUtils.printList(
            mergeTwoLists(
                ListNodeUtils.createFromList(List.of()), ListNodeUtils.createFromList(List.of()))));
    System.out.println(
        ListNodeUtils.printList(
            mergeTwoLists(
                ListNodeUtils.createFromList(List.of()),
                ListNodeUtils.createFromList(List.of(0)))));

    System.out.println(
        ListNodeUtils.printList(
            mergeTwoLists(
                ListNodeUtils.createFromList(List.of(2)),
                ListNodeUtils.createFromList(List.of(1)))));
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    if (l1 == null) {
      return l2;
    }

    if (l2 == null) {
      return l1;
    }

    ListNode resultHead = null;
    ListNode cur = null;
    while (l1 != null || l2 != null) {

      if (l1 == null || l2 == null) {
        var nex = l1 == null ? l2 : l1;
        if (cur == null) {
          return nex;
        }

        cur.next = nex;
        return resultHead;
      }

      if (l1.val <= l2.val) {
        if (cur == null) {
          cur = l1;
          resultHead = l1;
          l1 = l1.next;
          continue;
        }

        cur.next = l1;
        cur = cur.next;
        l1 = l1.next;
      } else {
        if (cur == null) {
          cur = l2;
          resultHead = l2;
          l2 = l2.next;
          continue;
        }

        cur.next = l2;
        cur = cur.next;
        l2 = l2.next;
      }
    }

    return resultHead;
  }
}
