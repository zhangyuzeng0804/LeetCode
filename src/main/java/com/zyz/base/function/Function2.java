package com.zyz.base.function;

/**
 *
 * @author yz.zhang
 * @since 2026-01-27
 */

public class Function2 {

//  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//    ListNode result = new ListNode();
//    ListNode cur = result;
//    int jinwei = 0;
//    while (l1 != null || l2 != null) {
//      int x = l1 == null ? 0 : l1.val;
//      int y = l2 == null ? 0 : l2.val;
//      int sum = x + y + jinwei;
//
//      jinwei = sum / 10;
//      cur.next = new ListNode(sum % 10);
//      cur = cur.next;
//      if (l1 != null) {
//        l1 = l1.next;
//      }
//      if (l2 != null) {
//        l2 = l2.next;
//      }
//    }
//    if (jinwei == 1) {
//      cur.next = new ListNode(1);
//    }
//    return result.next;
//  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = null;
    ListNode cur = null;
    int jinwei = 0;
    while (l1 != null || l2 != null) {
      int x = l1 == null ? 0 : l1.val;
      int y = l2 == null ? 0 : l2.val;
      int sum = x + y + jinwei;

      jinwei = sum / 10;
      if (result==null){
        result  = new ListNode(sum % 10);
        cur=result;
      }else {
        cur.next = new ListNode(sum % 10);
        cur = cur.next;
      }

      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (jinwei == 1) {
      cur.next = new ListNode(1);
    }
    return result;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }

    @Override
    public String toString() {
      return String.valueOf(val);
    }

  }
}



