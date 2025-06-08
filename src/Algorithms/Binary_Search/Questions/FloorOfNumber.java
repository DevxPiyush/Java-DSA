package Algorithms.Binary_Search.Questions;

import java.util.Arrays;
import java.util.Scanner;

// this is opposite to ceiling of a number - floor of a number
public class FloorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("Provide your array");
        for (int i = 0; i <arr.length; i++) {
            arr [i] = sc.nextInt();
        }
        System.out.println("The given array is " + Arrays.toString(arr));
        System.out.println("Provide your target element:");
        int target = sc.nextInt();
        System.out.println("The target element is " + target);
        int ans = floor(arr,target);
        if (ans == -1) {
            System.out.println("The Floor does not exist for the provided target");
        } else {
            System.out.println("The index of the floor for target " + target +" is "+ ans);
        }
        System.out.println("The floor element is " + arr[ans]);
    }
    static int floor(int[] arr, int target) {
    int start = 0;
    int end = arr.length-1;
        // if target is larger than the largest element in the array
        if (target < arr[start]) {
            return -1;
        }
        while (start <=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid-1;
            } else if (arr[mid] ==  target) {
                return mid;
            } else {
                start = mid + 1;
            }
        }
    return end;
    }
}

