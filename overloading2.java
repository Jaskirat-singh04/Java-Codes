public class overloading2 {

    void test() {
        System.out.println("no parameter");
    }

    void test(int a, int b) {
        System.out.println("a and b are " + a + " " + b);
    }

    void test(double a) {
        System.out.println("inide double method " + a);
    }
}

class overload {
    public static void main(String args[]) {
        overloading2 obj = new overloading2();
        int i = 10;
        obj.test();

        obj.test(10, 30);

        obj.test(i); // this will invoke test involving double, this is automatic conversion done by
                     // java

        obj.test(123.4); // this will invoke test double naturally

    }
}
/*
 * As you can see, this version of OverloadDemo does not define test(int).
 * Therefore, when test( ) is called with an integer argument inside Overload,
 * no matching method is found. However, Java can automatically convert an
 * integer into a double, and this conversion can be used to resolve the call.
 * Java will employ its automatic type conversions only if no exact match is
 * found.
 * 
 */