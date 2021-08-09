package com.fml.shuati;

import static com.fml.shuati.ListNodeUtils.printList;

import com.fml.shuati.ListNodeUtils.ListNode;
import java.util.List;

/** https://leetcode-cn.com/problems/remove-linked-list-elements/ */
public class RemoveLinkedListElements {

  public static void main(String[] args) {
    //
    var list = ListNodeUtils.createFromList(List.of(1, 2, 6, 3, 4, 5, 6));
    System.out.println(printList(list));
    var result = removeElements(list, 6);
    System.out.println(printList(result));
  }

  public static ListNode removeElements(ListNode head, int val) {

    var cur = head;
    ListNode pre = head;
    while (cur != null) {
      if (cur.val != val) {
        pre = cur;
        cur = cur.next;
        continue;
      }

      var target = cur.next;
      while (target != null) {
        if (target.val != val) {
          break;
        }

        target = target.next;
      }

      if (head == cur) {
        head = target;
      }

      cur = target;
      pre.next = cur;
    }

    return head;
  }
}
