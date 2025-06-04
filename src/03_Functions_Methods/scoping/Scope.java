package Package.functions_methods.scoping;

public class Scope {
    // scope = where we can access our variable
    public static void main(String[] args) {
        int a = 10;
        String name = "Piyush";
        {
            // wrong as a is already initialised outside the block in the same function
            //a = 20;
            int c = 99;
            name = "Rahul";
            System.out.println(name);
            // will print rahul bcoz - the name is initialized outside the block but is being modified
            // same refrence variable is used not new one is created
            // anything initialized inside the block can be reinitialized outside the block
        }
        System.out.println(name);
        //System.out.println(c);
        // value c cannot be used outside the block
        // scoping in for loop
        {
            for (int i = 0; i < 4; i++) {
                System.out.println("i");
            }
            // i will be not accessible here outside the for loop
        }
    }
}
// function scope = accessible inside a function only
// block scope = accessible inside a block (curly braces)
