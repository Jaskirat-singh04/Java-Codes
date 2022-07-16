class call_by_value{
    void meth(int i, int j){
        i *= 2;
        j /= 2;
    }
}
class callbyvalue{
    public static void main(String ares[]){
        call_by_value obj = new call_by_value();

        int a =15, b =10;
        System.out.println("before calling meth a and b are "+ a +" " + b);

        obj.meth(a,b);

        System.out.println("after calling meth a and b are "+ a +" " + b);


    }
}
