public class outer {
    int outer_x = 100;

    void test(){
        inner inner = new inner();
        inner.display();
    }

    class inner{
        void display(){
            System.out.println("outer_x is: "+ outer_x);
        }
    }
}
class class_nested{
    public static void main(String args[]){
         outer outer = new outer();
         outer.test();
    }
}

/*In the program, an inner class named Inner is defined within the scope of class
Outer. Therefore, any code in class Inner can directly access the variable outer_x.
An instance method named display( ) is defined inside Inner. This method displays
outer_x on the standard output stream. The main( ) method of InnerClassDemo
creates an instance of class Outer and invokes its test( ) method. That method
creates an instance of class Inner and the display( ) method is called. */