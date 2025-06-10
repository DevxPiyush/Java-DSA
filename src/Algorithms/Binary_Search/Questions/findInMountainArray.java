package Algorithms.Binary_Search.Questions;

import Algorithms.Binary_Search.BinarySearch;

//https://leetcode.com/problems/find-in-mountain-array/
public class FindInMountainArray {
    public static void main(String[] args) {
    }
    int search (int[] arr, int target){
    int peak = peakIndexInMountainArray(arr);
    int FirstTry = agnostic(arr,target,0,peak);
        if (FirstTry != -1) {
            return FirstTry;
        }
        //otherwise try to search in second half


    return agnostic(arr,target,peak+1,arr.length-1);
    }
    public static int peakIndexInMountainArray(int[] arr) {
       int start = 0;
       int end = arr.length-1;
       while (start < end){
           int mid = start + (end - start) / 2;
           if (arr[mid]>arr[mid+1]) {
               end = mid;
           } else if(arr[mid]<arr[mid+1]){

               start = mid + 1;
           }
       }

        return start; // or return end as both are equal
    }

    static int agnostic(int[] arr, int target, int start, int end) {
         start = 0;
        end = arr.length - 1;

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
