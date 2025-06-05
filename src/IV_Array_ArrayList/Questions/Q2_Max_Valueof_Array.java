package IV_Array_ArrayList.Questions;

import java.util.Scanner;

public class Q2_Max_Valueof_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        max(arr);
    }
    static void max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Max Value is "+ max);
    }
}
