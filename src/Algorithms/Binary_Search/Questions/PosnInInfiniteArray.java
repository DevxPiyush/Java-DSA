package Algorithms.Binary_Search.Questions;

// Simulate binary search on an infinite sorted array
public class PosnInInfiniteArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 16, 18, 20, 24, 29};
        int target = 10;
        System.out.println("Target found at index: " + ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        // Step 1: Find the range
        int start = 0;
        int end = 1;

        // Expand the range exponentially until target <= arr[end]
        while (target > arr[end]) {
            int newStart = end + 1;
            // Size of the current window = end - start + 1
            end = end + (end - start + 1) * 2;
            start = newStart;

            // Safety check: If end exceeds array length (only for simulation purpose)
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
        }

        // Step 2: Apply binary search in the found range
        return search(arr, target, start, end);
    }

    static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;  // Corrected
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;  // target not found
    }
}
