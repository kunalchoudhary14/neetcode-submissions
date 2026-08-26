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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // int c=0;
        // ListNode temp = head;
        // while(temp!=null){
        //     c++;
        //     temp=temp.next;
        // }
        // int k = c-n+1;
        // if(k==1){
        //     head=head.next;
        // }
        
        // else if(k==c){
        //     temp = head;
        //     while(temp.next.next!=null){
        //         temp=temp.next;
        //     }
        //     temp.next=null;
        // }
        // else{
        //     temp=head;
        // ListNode prev = new ListNode(0);
        // prev.next=temp;
        // int m=1;
        // while(temp!=null){
        //     if(m==k){
        //         prev.next=prev.next.next;
        //         break;
        //     }
        //     temp=temp.next;
        //     prev=prev.next;
        //     m++;
        //     }
        // }

        ListNode slow = head;
        ListNode fast = head;

        for(int i=0;i<n;i++){
            fast=fast.next;
        } 
    if(fast==null) return head.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next =slow.next.next;
        return head;

        
    }
}
