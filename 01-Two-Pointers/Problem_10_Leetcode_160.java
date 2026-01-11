
// Intersection of Two Linked Lists
// LEETCODE  160
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
public class Problem_10_Leetcode_160{
     public int length(ListNode head){
        ListNode temp = head;
        int count=0;
        while(temp != null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int lenA = length(headA);
        int lenB = length(headB);
        int diff = lenA -lenB;

         ListNode i = headA;
         ListNode j = headB;

         if(diff > 0){
           while(diff-- != 0)
               i = i.next;
              
        }else{
           while(diff++ != 0)
            j = j.next;
        }
        while(i != j  ){
            i =i.next;
            j=j.next;
        }
        return i;
    }
}