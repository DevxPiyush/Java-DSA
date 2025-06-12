package Algorithms.Binary_Search.Questions;

public class RotationCountInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {15,18,2,3,6,12};
        System.out.println(count(nums));
    }
    static int count(int[] nums) {
        int indexOfPivot = findPivot(nums);
        if (indexOfPivot == -1) {
            return 0; // Not rotated
        }
        return indexOfPivot + 1; // Number of rotations
    }

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
