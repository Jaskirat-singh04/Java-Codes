class class1 {
  double width;
  double height;
  double depth;  
}

class Demo{
    public static void main(String args[]){
         class1 mybox =  new class1();
         class1 mybox2 = new class1();
         double vol;

         mybox.width  = 10;
         mybox.height = 10;
         mybox.depth = 10;

         vol = mybox.width * mybox.height * mybox.depth;
         System.out.println("volume is: "+ vol);

        mybox2.height = 10;
        mybox2.width = 20;
        mybox2.depth = 30;

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("volume is: "+ vol);
        
    }
}
