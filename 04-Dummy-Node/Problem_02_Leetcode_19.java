// Remove Nth Node From End of List
// LEETCODE  19
// level Medium
// Time complexity  o(n)
// space complexity  0(1)
 class ListNode{
      int val;
      ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Problem_02_Leetcode_19{
     public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;


        while(n-- >= 0){
            fast= fast.next;
        }
        while(fast!= null ){
            slow = slow.next;
            fast = fast.next;
        }    
        
        slow.next = slow.next.next;

        return dummy.next;
    }
}
    