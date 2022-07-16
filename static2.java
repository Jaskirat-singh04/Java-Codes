
public class static2 {
    static int a = 42;
    static int b = 29;

    static void callme(){
        System.out.println("a is: "+a);
    }
}

    class staticdemo{
        public static void main(String args[]){
             static2.callme();
             System.out.println("b is: "+ static2.b);
        }
    }

    /* Outside of the class in which they are defined, static methods and variables can
be used independently of any object. To do so, you need only specify the name of
their class followed by the dot operator. For example, if you wish to call a static
method from outside its class, you can do so using the following general form: */
