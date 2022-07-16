public class constructor2 {
    
    double w;
    double h;
    double d;

    constructor2(double a, double b, double c){
        w=a;
        h=b;
        d=c;
    }

    double volume(){
        return w*h*d;
    }
}

class demo3{
    public static void main(String args[]){
         constructor2 box1 = new constructor2(1, 2, 3);
         constructor2 box2 = new constructor2(4, 5, 6);
         double vol;

         vol = box1.volume();
         System.out.println("volume is:" + vol);

         vol = box2.volume();
         System.out.println("volume is:" + vol);
    }
}