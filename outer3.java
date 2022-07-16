/* you can define a nested class within the block defined by a method or even
within the body of a for loop, as this next program shows:
*/
public class outer3 {
        int outer_x = 100;
        
        void test(){
            for(int i=0;i<10;i++){
                class inner{
                    void display(){
                        System.out.println("display outer_x "+outer_x);
                    }
                }
                inner inner = new inner();
                inner.display();
            }
        }
}
class innerclassdemo{
    public static void main(String args[]){
         outer3 outer = new outer3();
         outer.test();
    }
}