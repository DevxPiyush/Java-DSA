package Algorithms.Binary_Search.Questions;
// Que: given array [2,3,5,9,14,16.18] target number: 15
// The ceiling of number means the smallest whole number that is not smaller than that number.
// suppose target = 14, ceiling (arr,target) = 14
// target = 15, from the array ceiling is ceiling(arr,target) = 16
public class CelingOfANumber {
    public static void main(String[] args) {
    int [] arr = {2,4,6,8,10,12,14,16,18};
    int ans = Ceiling(arr,17);
        if (ans == -1) {
            System.out.println(" The Ceiling does not exist");
        }
        else {
            System.out.println("The index of Ceiling is " + ans +" and The element is "+ arr[ans]);
        }
    }
    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1 ;

        // if target is larger than the largest element in the array
        if (target > arr[end]) {
            return -1;
        }
        while (start<=end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }
        // we return start not end or -1 becasue At the end of binary search, start lands on the ceiling — the smallest number ≥ target.
        //end lands before the ceiling, hence not correct.
        //That's why we return start.
        return start ;
    }
}
