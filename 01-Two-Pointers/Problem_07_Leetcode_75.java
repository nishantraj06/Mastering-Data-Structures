// Sort colors
// Leetcode 75
// level EAsy
// Time complexity  o(n)
// space complexity  0(1)

class Solution {
    public void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        // Dutch National Flag   
        // only one pass
        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                mid++;
                low = low + 1;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high = high - 1;
            } else {
                mid++;
            }
        }
    }
}