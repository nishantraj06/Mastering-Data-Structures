// Middle of the Linked List
// LEETCODE 142
// level Easy
// Time complexity  o(n)
// space complexity  0(1)
 class ListNode{
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Problem_03_Leetcode_876 {

    
     public ListNode middleNode_01(ListNode head) {
        ListNode  temp =  head;
        int count = 0;

        while(temp != null){
           count++;
           temp = temp.next;
        }
        temp = head;
        for(int i = 0 ;i< count/2;i++){
            temp = temp.next;
        }
        return temp;
    }
    
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}



