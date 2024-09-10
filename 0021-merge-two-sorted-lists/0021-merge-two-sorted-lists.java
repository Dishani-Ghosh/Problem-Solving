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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

      ListNode tempA=list1;
      ListNode tempB=list2;
      ListNode headd=new ListNode(100);// we dont return it
      ListNode head=headd;
      while(tempA!=null && tempB!=null)
      {
      if(tempA.val<tempB.val)
      {
        head.next=tempA;
        head=tempA;
        tempA=tempA.next;
      } 
      else// tempB.val<tempA.val
      {
        head.next=tempB;
        head=tempB;
        tempB=tempB.next;
      } 
      }
      if(tempA==null)
      {
        head.next=tempB;

      }
      else
      head.next=tempA;

      return headd.next;
    }
}