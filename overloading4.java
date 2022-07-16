

public class overloading4 {
    int a, b;

    overloading4(int z, int x){
        a=z;
        b=x;
    }

    boolean test(overloading4 obj){

        if(obj.a==a && obj.b==b)
        return true;

        else
        return false;

    }
}

class passobj{
    public static void main(String args[]){
         overloading4 obj1 = new overloading4(100,12);
         overloading4 obj2 = new overloading4(100,12);
         overloading4 obj3 = new overloading4(1,12);

         System.out.println("obj1 == obj2: "+obj1.test(obj2));
         System.out.println("obj1 == obj3: "+obj1.test(obj3));

    }
}

/*Notice that the parameter o in equalTo( ) specifies Test
as its type. Although Test is a class type created by the program, it is used in just the
same way as Java’s built-in types.*/