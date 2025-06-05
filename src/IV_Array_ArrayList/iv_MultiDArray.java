package IV_Array_ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class iv_MultiDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Syntax: int[][] arr = new int[3][3];
        //Storing the value directly
        int [][]arr = {
                {1,2,3}, //0th index
                {4,5,6}, // 1st index
                {7,8,9}, // 2nd index
        };
        int[][] arr2d = new int[3][3];
    // array length is determined by its rows
        System.out.print(arr2d.length); //o/p = 3
    // input of a 2d array
        for (int row = 0; row <arr2d.length ; row++) {
            // for every column of that row it will be like
            for (int column = 0; column < arr2d[row].length ; column++) {
                arr2d[row][column] = sc.nextInt();
            }
        }
        // output of 2d array
        for (int row = 0; row <arr2d.length ; row++) {
            // for every column of that row it will be like
            for (int column = 0; column < arr2d[row].length ; column++) {
                System.out.print(arr2d[row][column] + " ");
            }
            System.out.println();
        }
    }
}
// imagine this 2d array as array into array itself
/*  jaise ki arr[0] ka apna khudka array
arr[1] ka khudka and so on
har ek index ek reference hota hai ek naye array ke liye
// remember the multid arrray ( 2d basically ) can have, so row declaration is important
*/