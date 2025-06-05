package IV_Array_ArrayList;

import java.util.Arrays;

public class III_PassingInFunctions {
    public static void main(String[] args) {
    int[] num = {3,6,9,10,12};
    System.out.println(Arrays.toString(num));
    change(num);
    System.out.println(Arrays.toString(num));
    // the value at 0th index is changed, because the array is mutable

    }
    static void change(int arr[]){
        arr[0] = 90;
    }
}
