public class call_by_ref {
    int a,b;

    call_by_ref(int i, int j){
        a=i;
        b=j;
    }

    void meth(call_by_ref obj){
        obj.a *= 2;
        obj.b /= 2;
    }
    
}

class callbyref{
    public static void main(String ares[]){
        call_by_ref obj = new call_by_ref(10,10);

        
        System.out.println("before calling meth a and b are "+ obj.a +" " + obj.b);

        obj.meth(obj);

        System.out.println("after calling meth a and b are "+ obj.a +" " + obj.b);


    }
}