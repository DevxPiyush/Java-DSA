package IV_Array_ArrayList;

import java.util.Arrays;

public class I_Intro_To_Array {
    public static void main(String[] args) {
        //Q: Store a roll number
        int a = 57;

        // Q: Store a person's name
        String name = "Pankaj Kumar";

        // Q: Store 500 roll numbers but how?
        // use Array
        // Syntax :
        //datatype[] variable_name = new datatype[size];
        int[] roll_no = new int[5];
        // or directly store values as the syntax : datatype[] variable_name = {values of defined datatype}
        int[] ro_no = {10,20,30,40,50};
        System.out.println(Arrays.toString(ro_no));
        // to print array always convert the arrrays -> string using the function defined above
        // indexing
        System.out.println(ro_no[1]);
    }
}
/* contains the data of the defined datatype only and also remember this
thing that array store a single datatype that is defined*/

/* int[] roll_no - declaration of array; Happens at compile time;
* roll_no is getting defined in the stack.
* roll_no = new int[5] - initialisation; happens at runtime;
* Dynamic memory Allocation; here the actual object is being created in the heap.*/
