// Rotate List
// LEETCODE  61
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
public class Problem_04_Leetcode_61{

     public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ) return head;
        if(k == 0) return head ;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp=temp.next;
        }
        if(count == k || k%count == 0) return head;
        int index = count - (k % count) ;
        temp = head;
        for(int i = 1 ; i <index ; i++){
           temp=temp.next;
        }

        ListNode temp2 = temp.next;
        temp.next = null;
        temp = temp2;
        while( temp2 != null &&temp2.next != null){
            temp2=temp2.next;    
        }
        temp2.next = head;
        head=temp;  
        return head;
    }

}



