//Baseball Game
// LEETCODE  682
// level Easy
// Time complexity  o(n)
// space complexity  0(1)

import java.util.*;
public class Problem_01_Leetcode_682{
     
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();

        for(int i = 0 ; i<operations.length;i++){
            String ch = operations[i];
            if(ch.equals("D")){
               int temp = s.peek();
               s.push(temp*2); 
            }
            else if(ch.equals("+")){
                int temp1 = s.pop();
                int temp2 = s.pop();
                int sum = temp1 + temp2 ;
                s.push(temp2);
                s.push(temp1);
                s.push(sum);
            }else if(ch.equals("C")){
                s.pop();
            }else{
                int data = Integer.parseInt(ch) ;
                s.push(data);
            }

        }
        int result = 0 ;
        while(!(s.isEmpty())){
            result += s.pop();
        }

        return result;
    }
}