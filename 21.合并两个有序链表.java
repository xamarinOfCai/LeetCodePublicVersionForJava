/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//  public class ListNode {
//          int val;
//          ListNode next;
//          ListNode(int x) { val = x; }
//  }

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null ){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        
        ListNode head = new ListNode(0);
        ListNode p = head;
        while(l1 != null && l2 != null){
            int valueOfL1 = l1.val;
            int valueOfL2 = l2.val;
            if(valueOfL1 < valueOfL2){
                ListNode newNode = new ListNode(valueOfL1);
                head.next = newNode;
                head = newNode;

                l1 = l1.next;
            }else if(valueOfL2 < valueOfL1){
                ListNode newNode = new ListNode(valueOfL2);
                head.next = newNode;
                head = newNode;

                l2 = l2.next;
            }else{
                ListNode newNode = new ListNode(valueOfL1);
                head.next = newNode;
                head = newNode;
                ListNode newNode2 = new ListNode(valueOfL2);
                head.next = newNode2;
                head = newNode2;

                l1 = l1.next;
                l2 = l2.next;
            }
        }

        ListNode tempNode = (l1 == null)? l2 : l1;
        while( tempNode != null){
            ListNode newNode = new ListNode(tempNode.val);
            head.next = newNode;
            head = newNode;
            tempNode = tempNode.next;
        }
        return p.next;
    }
}

