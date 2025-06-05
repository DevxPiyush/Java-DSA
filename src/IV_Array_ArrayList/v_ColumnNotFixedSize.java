package IV_Array_ArrayList;

import java.util.Arrays;

public class v_ColumnNotFixedSize {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4,5,6,7},
                {8},
        };
        // output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
