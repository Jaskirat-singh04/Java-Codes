public class class3 {
    double w;
    double h;
    double d;

        double volume(){
        
        return (w*h*d);
    }
}

class demo{
    public static void main(String args[]){
        double vol;
          class3 box1 = new class3();
          class3 box2 = new class3();

          box1.h=1;
          box1.w=2;
          box1.d=3;

          vol = box1.volume();
          System.out.println("volume is: "+vol);

          box2.w=4;
          box2.h=5;
          box2.d=6;

          vol = box2.volume();
          System.out.println("volume is: "+vol);
    }
}
