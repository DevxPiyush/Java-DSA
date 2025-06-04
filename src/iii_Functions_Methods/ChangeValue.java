package Package.functions_methods;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=99;
        // this says that the 0th index of arr should be changed by nums
        // will the original arr be changed?
        // yes !
        // this is because we are modifying the array not creating the new one
        // if you make a change to the object via this ref variable, same object will be changed
    }
}
