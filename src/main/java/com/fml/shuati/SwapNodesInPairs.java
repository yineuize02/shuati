package com.fml.shuati;

import static com.fml.shuati.utils.ListNodeUtils.createFromList;
import static com.fml.shuati.utils.ListNodeUtils.printList;

import com.fml.shuati.utils.ListNodeUtils.ListNode;
import java.util.List;

public class SwapNodesInPairs {

  public static void main(String[] args) {
    //
    System.out.println(printList(swapPairs(createFromList(List.of(1, 2, 3, 4)))));
  }

  public static ListNode swapPairs(ListNode head) {

    if (head == null) {
      return null;
    }

    var dummyHead = new ListNode(-1);
    dummyHead.next = head;
    var temp = dummyHead;
    while (temp.next != null && temp.next.next != null) {
      var a = temp.next;
      var b = temp.next.next;
      temp.next = b;
      a.next = b.next;
      b.next = a;
      temp = a;
    }

    return dummyHead.next;
  }
}
