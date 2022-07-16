
class static1{
    static int a =3;
    static int b;

    static void meth(int x){
        System.out.println("x is: "+x);
        System.out.println("a is: "+a);
        System.out.println("b is: "+b);

    }

    static {
      System.out.println("static block initialised");
      b=a*4;  
    }

    public static void main(String args[]){
         meth(42);
    }
}
/*As soon as the UseStatic class is loaded, all of the static statements are run. First,
a is set to 3, then the static block executes, which prints a message and then
initializes b to a*4 or 12. Then main( ) is called, which calls meth( ), passing 42 to x. The three println( ) statements refer to the two static variables a and b, as well as
to the parameter x. */

