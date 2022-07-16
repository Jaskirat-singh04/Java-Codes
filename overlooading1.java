public class overlooading1{
    void test(){
        System.out.println("no parameters");
    }

    void test(int a){
        System.out.println("one parameter "+ a);
    }

    void test(int a, int b){
        System.out.println("two parameters " +a +" " +b);
    }

    double test(double a){
        System.out.println("double parameter " +a);
        return a*a;
    }
public static void main(String args[]){
         overlooading1 obj = new overlooading1();
         double result;

         obj.test();
         obj.test(1);
         obj.test(2, 3);
         result = obj.test(10.0);
         System.out.println("result is:"+ result);


    }

}
