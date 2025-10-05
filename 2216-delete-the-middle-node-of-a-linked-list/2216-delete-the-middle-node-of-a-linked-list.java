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
    public int count(ListNode head){
        int cnt = 0;
        ListNode temp = head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public ListNode deleteMiddle(ListNode head) {
        int cnt = count(head);
        if(head.next == null || head == null) return null;
        int delnode =  cnt/2;
        ListNode temp = head;
        while(temp != null){
            delnode--;
            if(delnode == 0){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}