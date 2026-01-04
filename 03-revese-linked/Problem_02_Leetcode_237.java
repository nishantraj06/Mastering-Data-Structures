 //  Delete Node in a Linked Lis
// LEETCODE 237
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
public class Problem_02_Leetcode_237{ 

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
}
