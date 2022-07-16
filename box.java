//dealing with SUPER
class box{
    private double width;
    private double height;
    private double depth;

    box(box obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    box(){
        width = height = depth = -1;
    }

    box(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}

class boxweight1 extends box{
    double weight;

    boxweight1(boxweight1 obj){
        super(obj);
        weight = obj.weight;
    }

    boxweight1(double w, double h, double d, double m){
        super(w,h,d);
        weight = m;
    }

    boxweight1(){
        super();
        weight = -1;
    }

    boxweight1(double len, double m){
        super(len);
        weight = m;
    }
}

class demosuper{
    public static void main(String args[]){
        boxweight1 obj1 = new boxweight1(10,20,30,40);
        boxweight1 obj2 = new boxweight1(1,2,3,4.57);
        boxweight1 obj3 = new boxweight1();
        boxweight1 objcube = new boxweight1(3,4);
        boxweight1 objclone = new boxweight1(obj1);

        System.out.println("volume of obj1 is: "+ obj1.volume());
        System.out.println("weight of obj1 is: "+obj1.weight);
        System.out.println();

        System.out.println("volume of obj2 is: "+ obj2.volume());
        System.out.println("weight of obj2 is: "+obj2.weight);
        System.out.println();


        System.out.println("volume of obj3 is: "+ obj3.volume());
        System.out.println("weight of obj3 is: "+obj3.weight);
        System.out.println();


        System.out.println("volume of objcube is: "+ objcube.volume());
        System.out.println("weight of objcube is: "+objcube.weight);
        System.out.println();


        System.out.println("volume of objclone is: "+ objclone.volume());
        System.out.println("weight of objclone is: "+objclone.weight);
        System.out.println();




                 
    }
}





/*
 Pay special attention to this constructor in BoxWeight:

 boxweight1(boixweight1 obj){
     super(ob);
     weight = ob.weight;
 }

Notice that super( ) is passed an object of type BoxWeight—not of type Box.
This still invokes the constructor Box(Box ob). As mentioned earlier, a superclass
variable can be used to reference any object derived from that class. Thus, we are
able to pass a BoxWeight object to the Box constructor. Of course, Box only has
knowledge of its own members.

*/


