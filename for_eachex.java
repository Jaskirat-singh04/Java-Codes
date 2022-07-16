public class for_eachex {
    public static void main(String args[]){
         int num[]={1,2,3,4,5,6,7,8,9,10};
         int sum=0;

         for (int x:num){
         System.out.println("Value is " +x);
         // x= x*10; //no effect on num
         sum+= x;
         //if (x==5) break; //stops the loop when 5 is obtained
         }
         System.out.println("summation: "+sum);
    }
    
}
/* Although the for-each for loop iterates until all elements in an array have been
examined, it is possible to terminate the loop early by using a break statement.

# you can’t change the contents of the array by assigning the iteration variable a new value.
*/