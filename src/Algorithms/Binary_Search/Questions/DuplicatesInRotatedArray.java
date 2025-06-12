package Algorithms.Binary_Search.Questions;

public class DuplicatesInRotatedArray {
    public static void main(String[] args) {

    }
    static int search(int[] nums, int target) {
        int pivot = findPivotWithDuplicates(nums);

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
    static int findPivotWithDuplicates(int[] nums) {
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
            // if elements at middle,start or end are equal then, just skip the duplicates 
            if (nums[mid]==nums[start] && nums[mid] == nums[end]) {
                // skip the duplicates

                // note, what if this eleemnts are at start and end were the pivot??
                // check if start is pivot
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start = start + 1;
                // check if end is pivot
                if (nums[end] < nums[end-1]) {
                    return end;
                }
                end = end - 1;
            }
    // left side iss sorted, so pivot should be in right
            else if (nums[start] < nums[mid] || nums[start] == nums[mid] && nums[end] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid -1;}
        }
        return -1; // No pivot found, array is not rotated
    }
}
