// Palindrome Number
// Leetcode 9
// level EAsy
// Time complexity  o(n)
// space complexity  0(1)

class Solution {
    //two pointers appoarch
    public boolean isPalindrome_first(int x) {
         if (x < 0) return false;
        String numStr = String.valueOf(x);
        int left = 0, right = numStr.length() - 1;
        while (left < right) {
            if (numStr.charAt(left) != numStr.charAt(right)) {
                   return false;
                }
            left++;
            right--;
        }
        return true;
    }
    //math apporach
    public boolean isPalindrome_Second(int x) {
      int num = x;
      int res =0;
      while(x>0){
        int rem = x%10;
        res=res*10+rem;
        x=x/10;
      }
        if(num == res)
         return true;
      else
      return false;  
    }
}
