public class recursion2 {
    int values[];

    recursion2(int i){
        values = new int [i];
    }

    void printarray(int i){
        if(i==0)
        return;
        else printarray(i-1);
        System.out.println("'["+  (i-1)+ "]"+ values[i-1]);
    }
}

class demo5{
    public static void main(String args[]){
         recursion2 obj = new recursion2(10);

         for(int i=0;i<10;i++)
         obj.printarray(10);
    }
}