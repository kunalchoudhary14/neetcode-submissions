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
    public ListNode reverseList(ListNode head) {
         ListNode temp = head;

    //      Stack<Integer> st = new Stack<>();

    //      while(temp!=null){
    //         st.push(temp.val);
    //         temp = temp.next;
    //      }
    // temp =head;
    //      while(temp!=null){
    //         temp.val=st.pop();
    //         // st.
    //         temp = temp.next;
    //      }
    // ListNode prev = new Listnode(0);
    ListNode prev = new ListNode(0);
    ListNode front = new ListNode(0);
    prev = null;
    while(temp!=null){
        front =temp.next;
        temp.next=prev;
        prev = temp;
        head = temp;
        temp=front;
    }
    // head = prev;
    // head.next=temp;
         return head;     
    }
}
