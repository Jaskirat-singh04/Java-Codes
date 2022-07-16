public class overloading3 {
    double width;
    double height;
    double depth;

    overloading3(){
        width =-1;
        height = -1;
        depth = -1;
    }

    overloading3(double z, double c, double b){
        width = z;
        height = c;
        depth = b;
    }

    overloading3(double len){ //for making a square since square has all sides same, therefore only one side measure is passed whioch is said to all memebers

        width = height = depth = len;
    }

    double volume(){
        return width* height*depth;
    }
}

class over{
    public static void main(String args[]){
         
        overloading3 obj1 = new overloading3();
        overloading3 obj2 = new overloading3(3);
        overloading3 obj3 = new overloading3(1,2,3);

        System.out.println("volume : "+obj1.volume());
        System.out.println("volume : "+obj2.volume());
        System.out.println("volume : "+obj3.volume());

    }
}
