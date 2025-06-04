package Package.functions_methods;

public class overloading {
    public static void main(String[] args) {
    fun(67);
    fun("hello");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
/*
overloading - 2 or more functions of same name can exist if they have different parameter
happens in compile time only.
*/
