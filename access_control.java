public class access_control {
    int a;
    public int b;
    private int c;

    void setc(int i){
        c=i;
    }
    int getc(){
        return c;
    }
}

class demo6{
    public static void main(String args[]){
         
        access_control obj = new access_control();

        obj.a = 10;
        obj.b = 20;

        //obj.c = 30; will cause error cause c is private

        obj.setc(30);
        obj.getc();

        System.out.println("Values of a, b , and c are :"+ obj.a + " "+ obj.b + " "+ obj.getc());


    }
}