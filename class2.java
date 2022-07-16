public class class2 {
    double w;
    double h;
    double d;

        void volume(){
        System.out.print("volume is : ");
        System.out.println(w*h*d);
    }
}

class demo{
    public static void main(String args[]){
          class2 box1 = new class2();
          class2 box2 = new class2();

          box1.h=1;
          box1.w=2;
          box1.d=3;

          box1.volume();

          box2.w=4;
          box2.h=5;
          box2.d=6;

          box2.volume();
    }
}
