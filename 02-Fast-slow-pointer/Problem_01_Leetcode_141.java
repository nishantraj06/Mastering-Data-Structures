// Linked List Cycle
// LEETCODE 141
// level Easy
// Time complexity  o(n)
// space complexity  0(1)

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
     }
    }
    
public class Problem_01_Leetcode_141{
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        boolean result = false;

        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == slow){
                    result = true;
                    break;
            }
        }
        return result;
    }
}