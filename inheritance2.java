

class inheritance2 {
    double width;
    double height;
    double depth;

    inheritance2(inheritance2 obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    inheritance2(double x, double y, double z){
        width = x;
        height = y;
        depth = z;
    }

    inheritance2(){
        width = height= depth = -1;
    }

    inheritance2(double len){
        width = height = depth = len;
    }

    double volume(){
        return width*height*depth;
    }
}

//here class weight extends the other class to add the weight attribute to the program
class boxweight extends inheritance2{

    double weight;

    boxweight(double x, double y, double z, double v){
        width=x;
        height=y;
        depth=z;
        weight=v;
    }
}

class boxdemo{
    public static void main(String args[]){
         
        boxweight obj1 = new boxweight(1,2,3,4);
        boxweight obj2 = new boxweight(5,6,7,8);

        System.out.println("volume of box1 is:" +obj1.volume());
        System.out.println("weight of the box1 is:"+obj1.weight);

        System.out.println("volume of box2 is: "+obj2.volume());
        System.out.println("volume of box2 is: "+obj2.weight);
        }
}

/* extending box again......abstract
 class color extends boxweight{
     int color;

     color(double x, double y, double z, int c){
         width = x;
         height = h;
         depth = z;
         color = c;
     }
 }
*/


/*A reference variable of a superclass can be assigned a reference to any subclass
derived from that superclass.

class refdemo{
    public static void main(String args[]){
        boxweight weightbox1 = new boxweight(3,4,5,6);
        inheritance2 plainbox = new inheritance2();

        s.o.p("volume is: "+ weightboix.volume());
        s.o.p("wight is: "+weightbox.weight);

        //assignn boxweight reference to the inheritance2 reference

        plainboox = weightbox;

        s.o.p("volume is: "+plainbox.volume());
        s.o.p("weight is: "+plainbox.weight); //statement nont valid because weight is not a member of inheritance2 class of which plainbox is reference, hence it cannot point to it

    }
}
*/

/*
Here, weightbox is a reference to BoxWeight objects, and plainbox is a reference to
inhjeritance2 objects. Since BoxWeight is a subclass of inheritance2, it is permissible to assign
plainbox a reference to the weightbox object.when a reference to a subclass object is assigned to a superclass reference
variable, you will have access only to those parts of the object defined by the
superclass. This is why plainbox can’t access weight even when it refers to a
BoxWeight object. superclass
has no knowledge of what a subclass adds to it. This is why the last line of code in
the preceding fragment is commented out. It is not possible for a inheritance2 reference to
access the weight field, because inheritance2 does not define one.
*/


