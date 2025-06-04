package Package.functions_methods.scoping;

public class shadowing {
    static int x = 90;
    public static void main(String[] args) {
    System.out.println(x); // will print 90
    int x = 40;
    System.out.println(x); // will print 40
    fun();
    }
    static void fun(){
        System.out.println(x); // will print 90
    }
}
// shadowing = pratice of using 2 variables with the same name within the scope that overlaps
// variable with higher level scope is hidden and wil be shadowed by the lower level
// line 4 is shadowed by line 7
// scope will begin when value is initialized
// shadowing does not act in method