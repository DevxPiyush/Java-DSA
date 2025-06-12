package Algorithms.Binary_Search.Questions;
// https://leetcode.com/problems/split-array-largest-sum
public class SplitArrayLargestSum{
    public static void main(String[] args) {
    }
    class Solution {
        public int splitArray(int[] nums, int k) {
            int start = 0;
            int end = 0;

            // Start = max of nums[], end = sum of nums[]
            for (int num : nums) {
                start = Math.max(start, num); // Lower bound of binary search
                end += num;                   // Upper bound of binary search
            }

            // Binary search the answer space
            while (start < end) {
                int mid = start + (end - start) / 2;

                // Check: Can we split into ≤ k parts with max subarray sum = mid?
                int sum = 0;
                int pieces = 1;
                for (int num : nums) {
                    if (sum + num > mid) {
                        // Need a new subarray
                        sum = num;
                        pieces++;
                    } else {
                        sum += num;
                    }
                }

                if (pieces <= k) {
                    // We can split into k or fewer parts, try a smaller max sum
                    end = mid;
                } else {
                    // Too many parts, try a larger max sum
                    start = mid + 1;
                }
            }

            return start; // or end, they will be equal
        }
    }

}
