public class constructor1 {
    double w;
    double h;
    double d;

    double volume(){
        return w*h*d;
    }

    constructor1(){
        System.out.println("constructor called");
        w =10;
        h =10;
        d= 10;
    }
}
class demo{
    public static void main(String args[]){
         
        constructor1 box1 = new constructor1();
        constructor1 box2 = new constructor1();
        double vol;

        vol = box1.volume();
        System.out.println("volume is:" + vol);

        vol = box2.volume();
        System.out.println("volume is; "+ vol);
    }
}

