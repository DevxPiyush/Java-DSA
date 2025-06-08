package Algorithms.Binary_Search.Questions;

public class FirstAndLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("First and Last Position of " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // find first occurrence
        ans[0] = search(nums, target, true);
        // find last occurrence
        ans[1] = search(nums, target, false);
        return ans;
    }
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans = mid;
                // narrow the search range to find first or last occurrence
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}