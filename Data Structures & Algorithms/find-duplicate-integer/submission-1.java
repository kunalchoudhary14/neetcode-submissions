 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public int findDuplicate(int[] nums) {
        int n= nums.length;
        // int[] f = new int [n];
        // for(int i=0;i<=n;i++){
        //     if(f[nums[i]]==0){
        //         f[nums[i]]=1;
        //     }
        //     else return nums[i];
        // }
        // return -1;
        if (nums == null || nums.length == 0) {
            return 1;
        }
     int slow = nums[0];
     int fast = nums[0];
     do{
        slow=nums[slow];
        fast=nums[nums[fast]];
     }while(slow!=fast);

     int temp = nums[0];
     while(temp!=slow){
        temp = nums[temp];
        slow=nums[slow];
     }


        return temp;
    }
}
