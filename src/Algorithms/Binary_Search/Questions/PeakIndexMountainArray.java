package Algorithms.Binary_Search.Questions;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/find-peak-element
public class PeakIndexMountainArray {
    public static void main(String[] args) {
    }
    public static int peakIndexInMountainArray(int[] arr) {
    // use binary search only
       int start = 0;
       int end = arr.length-1;
       while (start < end){
           int mid = start + (end - start) / 2;
           if (arr[mid]>arr[mid+1]) {
               // you are at the decreasing part of the array
               // this may be the answer but still look at the left array
               // this is why end != mid -1
               end = mid;
           } else if(arr[mid]<arr[mid+1]){
               // you are at the ascending part of the array
               start = mid + 1; // because we know that mid + 1 element > mid element
           }
       }
// in the end, start == end and pointing to the larget number because of the 2 checks
// start and end are always trying to find the max element in the above 2 checks
// hence, when they are pointing to one element, that is the max one, because that's what the check say
// more elaboration:
/* at every point of time for start and end, they have the best possible answer till that time
and if we are saying that the onle one item is remaining, hence cuz of above line thai is the best possible answer.
*/
        return start; // or return end as both are equal
    }
}
