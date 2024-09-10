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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp=head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        //determine the size of each part
        int partsize=length/k;
        int remainder=length%k;

        ListNode[]result=new ListNode[k];
        ListNode current=head;

        for(int i=0;i<k;i++)
        {
            result[i]=current;
            int currentpartsize=partsize+(i<remainder?1:0);

            for(int j=0;j<currentpartsize-1;j++)
            {
                if(current!=null)
                {
                    current=current.next;
                }
            }
            if(current!=null)
            {
                ListNode nextpart=current.next;
                current.next=null;
                current=nextpart;
            }
        }
        return result;
    }
}
/*
List length calculation: First, we calculate the total length of the list.

Part size calculation: We determine the base size for each part 
and how to distribute any remainder nodes.

Splitting logic: The loop distributes nodes across the parts 
while keeping track of how many nodes each part should contain.

This code will split the list into k parts, where the first few parts may have
 one more node if length % k != 0.*/