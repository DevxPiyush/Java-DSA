package Algorithms.Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
         int result = search(arr,50);
        if(result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
    // return the index
    // return -1 if target does not exist
    static int search(int[] arr, int target){
       int start = 0;
       int end = arr.length-1;
       while (start<=end){
          // int mid = (start + end )/2;// might be possible that (start + end) might exceed the integer size hence we should use the thing - ( start + ( end - start ))
            int mid = (start + (end - start))/ 2;
           if (arr[mid] == target) {
               return mid;
           } else if (arr [mid] < target) {
                start =  mid+1;
           } else {
            end = mid-1;
           }
           }
       return -1;
    }
}

/* why prefer ( start + (end - start) / 2 ) ??
* 1. Risk with (start + end) / 2
Suppose start = 2_000_000_000 and end = 2_000_000_010
Then start + end = 4_000_000_010 → this exceeds the maximum value of an int in Java, which is 2^31 - 1 = 2,147,483,647
➡️ This causes an overflow, resulting in a negative or incorrect number.
2. Safe version: start + (end - start) / 2
Here, end - start = 10, which is totally safe
So start + 5 will never cause an overflow
* */
