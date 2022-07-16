/*the following program uses a for loop to search an unsorted array for a
value. It stops if the value is found.
*/
public class for_eachx3 {
    public static void main(String args[]){
         int num[] = {6,7,8,9,4,5,3,5};
         int val1 =5;
         boolean found = false;

         for (int x:num){
             if (x==val1){
             found = true;
             break;
             }
         }
    
    if (found)
    System.out.println("Value found!!");
        }
}
