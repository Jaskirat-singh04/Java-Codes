public class recursion1 {
    int fact(int i){
        int result;

        if(i==1 || i==0)
            return 1;
        result = fact(i-1)*i;
        return result;
        
    }
}

class recursive{
    public static void main(String args[]){
         recursion1 obj = new recursion1();

         System.out.println("factorial of 3 is "+ obj.fact(3));
         System.out.println("factorial of 6 is "+ obj.fact(6));
    }
}