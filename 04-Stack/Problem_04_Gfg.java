// Next greater Element
// GFG pratice
// level Easy
// Time complexity  o(n)
// space complexity  0(1)

import java.util.*;

public class Problem_04_Gfg {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(arr[n-1]);
        result[n-1] = -1;
        for(int i = n-2;i>= 0 ; i--){
            while(!s.isEmpty() && s.peek() <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                result[i] = -1;
            }else{
                result[i] = s.peek();
            }
            s.push(arr[i]);
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<n;i++)
            list.add(result[i]);
            
        return list;
    }

}
