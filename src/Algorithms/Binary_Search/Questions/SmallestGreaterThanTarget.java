package Algorithms.Binary_Search.Questions;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// this is similar to ceiling just equal condition should be removed and larger only needed
// letters that wrap around = circular array is used

public class SmallestGreaterThanTarget {
    public static void main(String[] args) {
    char[] letters = {'a','b','s','t'};
    char target = 'q';
    char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }
        public static char nextGreatestLetter(char[] letters, char target) {
            int start = 0;
            int end = letters.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (letters[mid] <= target) {
                    start = mid + 1;  // Look right
                } else {
                    end = mid - 1;    // Look left
                }
            }

            // Since the array is circular, we use modulus to wrap around
            return letters[start % letters.length];
        }
    }

