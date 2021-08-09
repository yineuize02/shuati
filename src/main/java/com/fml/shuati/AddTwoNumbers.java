package com.fml.shuati;

import com.fml.shuati.utils.ListNodeUtils;
import com.fml.shuati.utils.ListNodeUtils.ListNode;
import java.util.List;

/** https://leetcode-cn.com/problems/add-two-numbers/ */
public class AddTwoNumbers {

  public static void main(String[] args) {
    //

    var tt = new AddTwoNumbers();
    var l1 = ListNodeUtils.createFromList(List.of(9, 9));
    var l2 = ListNodeUtils.createFromList(List.of(9));
    var result = tt.addTwoNumbers(l1, l2);
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode resultList = new ListNode();
    var resultNode = resultList;
    int plus = 0;
    while (true) {
      int a = 0;
      int b = 0;
      if (l1 != null) {
        a = l1.val;
      }

      if (l2 != null) {
        b = l2.val;
      }

      int r = a + b + plus;
      resultNode.val = r % 10;
      plus = r / 10;

      if (l1 != null) {
        l1 = l1.next;
      }

      if (l2 != null) {
        l2 = l2.next;
      }

      if (l1 == null && l2 == null && plus == 0) {
        break;
      }

      resultNode.next = new ListNode();
      resultNode = resultNode.next;
    }

    return resultList;
  }
}
