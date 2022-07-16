 public class overloading5 {
    double width;
    double height;
    double depth;

    overloading5(){
        width = -1;
        height = -1;
        depth = -1;
    }

    overloading5(double len){
        width= height = depth = len;
    }

    overloading5(double a, double b, double c){
        width = a;
        height = b;
        depth = c;
    }

    overloading5(overloading5 obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    double volume(){
        return width * height* depth;
    }




    public static void main(String args[]){

        overloading5 obj1 = new overloading5();
        overloading5 obj2 = new overloading5(1);
        overloading5 obj3 = new overloading5(1,2,3);
        overloading5 obj4 = new overloading5(obj3);

        System.out.println("volume is: "+obj1.volume());
        System.out.println("volume is: "+obj2.volume());
        System.out.println("volume is: "+obj3.volume());
        System.out.println("volume is: "+obj4.volume());

    }}

