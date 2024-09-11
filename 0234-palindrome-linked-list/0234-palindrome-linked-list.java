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
    public ListNode reverse(ListNode head)
    {
        ListNode current=head;
        ListNode prev=null;
        ListNode next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        //step 1 find middile element
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        //reverse from mid
        ListNode temp=reverse(slow.next);
        slow.next=temp;
        ListNode p1=head;
        ListNode p2=slow.next;
        while(p2!=null)
        {
            if(p1.val!=p2.val)
            return false;
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
}