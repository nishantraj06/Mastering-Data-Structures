 //Valid Parentheses
// LEETCODE  20
// level Easy
// Time complexity  o(n)
// space complexity  0(1)

import java.util.*;
public class Problem_02_Leetcode_20{
     
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i< s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else {
                if(st.isEmpty()) return false;
                char top = st.pop();
                if((ch == ')' && top != '(') ||
                   (ch == '}' && top != '{') ||
                   (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
