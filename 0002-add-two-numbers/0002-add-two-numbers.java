/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tail = res;
        int c = 0;
        while(l1 != null || l2 != null || c != 0){
            int d1 = 0;
            int d2 = 0;
            if(l1 != null){
                d1 = l1.val;
            }
            if(l2 != null){
                d2 = l2.val;
            }
            int sum = d1 + d2 + c;
            ListNode newNode = new ListNode(sum % 10);
            tail.next = newNode;
            tail = tail.next;
            c = sum / 10;
            l1 = (l1 != null) ? l1.next: null;
            l2 = (l2 != null) ? l2.next : null;
            
        }
        return res.next;
    }
}