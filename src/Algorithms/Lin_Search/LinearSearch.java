package Algorithms.Lin_Search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,53,37,47};
        // input via loop
//        for (int i = 0; i <arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
        linearSearchh(arr,53);
    }
    static int linearSearchh(int[] arr, int target){
        // search for array: return the index if found
        // if not then return -1

        for (int index = 0; index <arr.length; index++) {
            // check for element at every index of the array if it is = target
            int element = arr[index];
            if (element == target) {
                System.out.println(index);
            }
            if (arr.length == 0) {
                System.out.println("no Element Found");
            }
        }
        return target;
    }
}


