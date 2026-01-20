 //  Binary Search
// Leetcode 704
// level Easy
// Time complexity  o(logn)
// space complexity  0(1)

class Problem_12_Leetcode_704 {
    
    public int search(int[] arr, int target) {
       
       int low = 0 ;
       int high =  arr.length-1;

       while(low <= high){
        int mid = (low+high)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target) low = mid+1;
        else high = mid-1;
       } 
       return -1;
    }
}