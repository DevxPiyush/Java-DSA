package Algorithms.Binary_Search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {39, 28, 17, 15, 8, 6, 4, 2, 0}; // descending order
        int result = agnostic(arr, 15);
        System.out.println(result); // should print the index of 15
    }

    static int agnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // check if the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check for match — this is common to both orders
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // not found
    }
}
