// Linked List Cycle
// LEETCODE 142
// level Medium
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
    
public class Problem_02_Leetcode_142{
   public ListNode detectCycle(ListNode head) {
        ListNode slow = head ;
        ListNode fast = head ;
        boolean flag = false;
       
         while(fast != null && fast.next != null){
            slow = slow.next ;
           fast = fast.next.next; 
           
            if(slow == fast){
                flag = true;
                break;
            }    
        }

         if(flag == false) return null; 
         
        slow = head;
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
         return slow;
       
    }
}