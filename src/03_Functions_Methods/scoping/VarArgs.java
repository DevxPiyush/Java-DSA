package Package.functions_methods.scoping;

import java.util.Arrays;

// variable length arguments -> we do not know how many inputs we are giving
public class VarArgs {
    public static void main(String[] args) {
    fun(1,2,3,4,4,5,3,2,3,4,5);
    multiple(10,20,"hello","world"); // ordering is important
    }
    static void fun(int ... v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ... v ){
    }
}
// the length of argument is not fixed in varargs
// ranging from 0 -> infinity
/* when using function overriding varargs cant be empty! */