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
    public ListNode findnth(ListNode head, int k) {
        k=k-1;
        ListNode t= head;
        while(t!=null && k>0){
            t=t.next;
            k--;
        }
        return t;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        
        ListNode temp = head;
        int n=1;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        if(k%n==0) return head;
        k=k%n;
        temp.next = head;
        ListNode nth = findnth(head, n-k);
        head=nth.next;
        nth.next = null;

        // int n=1;
        // while(t != null){
        //     t=t.next;
        //     n++;
        //     }
        //     k=k%n;
        // while(k>0){
        //     ListNode temp = head;
        //     while(temp.next.next != null){
        //         temp=temp.next;
        //     }
        //     ListNode tail = temp;
        //     tail.next.next = head;
        //     head = tail.next.next;
        //     tail.next = null;
        //     k--;
        // }
        

        return head;
    }
}