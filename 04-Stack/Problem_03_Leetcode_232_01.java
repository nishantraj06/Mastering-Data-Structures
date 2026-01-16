// Implement Queue using Stacks
// LEETCODE  232
// level Easy
// Time complexity  o(n)
// space complexity  0(1)

import java.util.*;
 class Problem_03_Leetcode_232_01{ 
     // Add Efficient Approach
      Stack<Integer> main = new Stack<>();
      Stack<Integer> helper = new Stack<>(); 
    
    public void push(int x) {
        main.push(x);
    }
    
    public int pop() {
        while(main.size() != 1) helper.push(main.pop());
        int data = main.pop();
        while(!helper.isEmpty()) main.push(helper.pop());
        return data;
    }
    
    public int peek() {
        while(main.size() != 1) helper.push(main.pop());
        int data = main.peek();
        while(!helper.isEmpty()) main.push(helper.pop());
        return data;
    }
    
    public boolean empty() {
        return main.isEmpty();
    }
}


