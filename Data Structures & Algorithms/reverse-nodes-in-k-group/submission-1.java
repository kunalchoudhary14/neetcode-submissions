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
    public ListNode reverse(ListNode head){
        if(head ==null || head.next == null) return head;
        ListNode t = head;
        ListNode prev = null;
        
        while(t != null){
            ListNode front = t.next;
            t.next = prev;
            prev = t;
            t= front;
        }
        head = prev;
        return head;
    }
    public ListNode findkth(ListNode head, int k){
        k=k-1;
        ListNode t = head;
        while(t != null && k>0){
            k--;
            t = t.next;
            
        }
        return t;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prev = new ListNode(0);
        // while(temp!=null){
        //     ListNode kth = findkth(temp,k);
        //     if(kth == null){
        //         prev.next = temp;
        //         break;
        //     }
        //     ListNode next = kth.next;
        //     kth.next = null;
        //     reverse(temp);
        //     if(head == temp){
        //         head = kth;
        //     }
        //     else {
        //         prev.next = kth;
        //     }
        //     prev = temp;
        //     temp=next;
        // }
        while(temp!=null){
            ListNode kth = findkth(temp,k);
            if(kth == null){
                prev.next = temp;
                break;
            }
            ListNode next = kth.next;
            kth.next= null;
            reverse(temp);
            if(head == temp){
                head = kth;
            }
            else prev.next = kth;
            prev = temp;
            temp = next;
        }
        return head;
    }
}
