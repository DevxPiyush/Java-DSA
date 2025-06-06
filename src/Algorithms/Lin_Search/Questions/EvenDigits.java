package Algorithms.Lin_Search.Questions;
// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums){
    int count = 0;
    for(int i = 0; i<nums.length;i++){
        if(even(nums[i])){
            count++;
        }
    }
    return count;
    }
    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int NumberOfDigits = digits(num);
        if (NumberOfDigits %2== 0) {
        return true;
        }
        return false;
    }
    // count number of digits in a number
    static int digits(int num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

}
