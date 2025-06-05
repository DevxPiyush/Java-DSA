package IV_Array_ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class ii_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        // array of primitives
        arr[0] = 10;
        arr[1]= 3;
        arr[2] = 20;
        arr[3] = 4;
        arr[4] = 89;
        System.out.println(arr[3]);
        // input using for loop
        for (int i = 0; i <arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        //array of String
        String[] str = new String[5];
        for (int i = 0; i <str.length ; i++) {
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
