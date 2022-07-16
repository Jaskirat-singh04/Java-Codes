//multilevel example
public class box1 {

    private double width;
    private double height;
    private double depth;

    box1(box1 obj){
        width = obj.width;
        height = obj.height;
        depth = obj.depth;
    }

    box1(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    box1(double len){
        width = height = depth = len;
    }
    
    double volume(){
        return width*height*depth;
    }

    box1(){
        width = height = depth = -1;
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

class shipment extends boxweight1{
    double cost;

    shipment(shipment obj){
        super(obj);
        cost = obj.cost;
    }

    shipment(double w, double h, double d,double m, double c){
        super(w,h,d,m);
        cost = c;
    }

    shipment(){
        super();
        cost = -1;
    }

    shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}


class demoshipment{
    public static void main(String args[]){
         shipment ship1 = new shipment(10,20,15,10,3.41);
         shipment ship2 = new shipment(2,3,4,0.76,1.28);

         System.out.println("volume of shipment 1 is: "+ ship1.volume());
         System.out.println("wieght of shipment 1 i: "+ship1.weight);
         System.out.println("cost of shipment 1 is: "+ ship1.cost);


         System.out.println();

         System.out.println("volume of shipment 2 is: "+ ship2.volume());
         System.out.println("wieght of shipment 2 i: "+ship2.weight);
         System.out.println("cost of shipment 2 is: "+ ship2.cost);


    }
}

/*super( ) always refers to the
constructor in the closest superclass. The super( ) in Shipment calls the constructor
in BoxWeight. The super( ) in BoxWeight calls the constructor in Box.
*/