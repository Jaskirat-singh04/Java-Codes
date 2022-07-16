public class inheritance1 {
    int i, j;

    void show(){
        System.out.println("i and j are: "+i + " "+ j);
    }
    
}

class subclass extends inheritance1{
    int k;

    void showk(){
        System.out.println("k value is: "+k);
    }

    void sum(){
        System.out.println("sum of i j and k is: "+ (i+j+k));
    }
}

class inheritancedemo{
    public static void main(String args[]){
         inheritance1 obj1 = new inheritance1();
         subclass obj2 = new subclass();

            // you can use the object of superclass itself like

            obj1.i=10;
            obj1.j=10;
            System.out.println("using superclasss object!");
            obj1.show();
            System.out.println();

        // we can use the objects of subclass to access the members of superclass, thanks to inheritance

         obj2.i = 10;
         obj2.j = 20;
         obj2.k = 30;
        System.out.println("using sublcass object!!");
        obj2.show();
        obj2.showk();
        System.out.println();

        obj2.sum();
    }
}