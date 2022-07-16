public class class4 {
    double w;
    double h;
    double d;

    double volume(){
        return w*h*d;
    }

    void setdata(int a,int b, int c){
        w = a;
        h = b;
        a= c;
    }
}

class demo2{

    public static void main(String args[]){
        double vol;
        class4 box1 = new class4();
        class4 box2 = new class4();

        box1.setdata(1,2,3);
        box2.setdata(4,5,6);

        vol = box1.volume();
        System.out.println("volume is: "+vol);

        vol = box2.volume();
        System.out.println("volume is: "+ vol);

    }
}
