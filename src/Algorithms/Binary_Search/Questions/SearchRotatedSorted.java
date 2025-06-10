package Algorithms.Binary_Search.Questions;
// https://leetcode.com/problems/search-in-rotated-sorted-array
public class SearchRotatedSorted {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        System.out.println("Target found at index: " + result);
    }

    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // If no pivot, the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
// if pivot found, you have found 2 asc sorted arrays
        // three cases can be possible:
        // case 1 : if pivot is same as target
        // case 2 : if start < target, search space is reduced to start till pivot -1;
        // case 3 : if start > target, we know that all elements from s, pivot are going to be bigger than target search space = pivot + 1 till end
        // If pivot element is the target
        if (nums[pivot] == target) {
            return pivot;
        }

        // If target is greater than or equal to first element
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        // Else search in second half
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
// will not work in duplicate values
    static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Case 1: pivot is mid
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // Case 2: pivot is mid-1
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // Case 3: left is unsorted
            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                // Case 4: right is unsorted
                start = mid + 1;
            }
        }

        return -1; // No pivot found, array is not rotated
    }
}
