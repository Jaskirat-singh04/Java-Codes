public class outer2 {
    int outer_x = 200;

     void test(){
         inner inner = new inner();
         inner.display();
     }

     class inner{
         int y = 10; // y i local to inner

         void display(){
             System.out.println("display outer_x: " +outer_x);
         }
     }

     void show(){
         //System.out.println("value of y is: "+ y); will show error because y is local to iner class and the outer clas cannot access the elements of inner class
     }
}

class innerdemo{
    public static void main(String args[]){
         outer2 outer = new outer2();
         outer.test();
    }
}