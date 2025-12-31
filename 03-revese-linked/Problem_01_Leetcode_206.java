// Reverse Linked List
// LEETCODE 206
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
public class Problem_01_Leetcode_206 {
    
    public ListNode reverseList(ListNode head) {
       ListNode prev = null;
       ListNode nex = null ;
       ListNode cur = head;
       while(cur != null){
            nex = cur.next;
            cur.next = prev ;
             prev = cur;
             cur = nex;   
       } 
       return prev;
    } 
}
