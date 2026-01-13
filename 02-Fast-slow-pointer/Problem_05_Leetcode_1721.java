//Swapping Nodes in a Linked List
// LEETCODE  1721
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
public class Problem_05_Leetcode_1721{

     
    public int count(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head=head.next;
        }
        return count;
    } 
    public ListNode swapNodes(ListNode head, int k) {
        int len = count(head);
        int fastIndex = len - k;
        int slowIndex = k-1;

        ListNode slow = head;
        ListNode fast = head;

        if(fastIndex == slowIndex){
            return head;
        }

        while(slowIndex-- != 0){
            slow = slow.next;
        }
        while(fastIndex-- != 0){
            fast = fast.next;
        }

        int temp = slow.val;
        slow.val= fast.val;
        fast.val = temp;

        return head;
    }
}
