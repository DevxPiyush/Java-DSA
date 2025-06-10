package Algorithms.Binary_Search.Questions;
// https://leetcode.com/problems/search-insert-position
public class SearchInsertPositon {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9,10};
        searchInsert(arr,8);
    }
        public static int searchInsert(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] == target) {
                    return mid;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }// if element not found at the array, return start not -1 as start = position to be inserted
            return start;
        }
    }


