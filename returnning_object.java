public class returnning_object {
    int a;

    returnning_object(int i){
        a=i;
    }

    returnning_object inc(){

        returnning_object temp = new returnning_object(a+10);
        return temp;
    }
    
}

class returnob{
    public static void main(String args[]){
         
        returnning_object obj1 = new returnning_object(2);
        returnning_object obj2;

        obj2 = obj1.inc();
        System.out.println("obj1.a "+obj1.a);
        System.out.println("obj2.a "+obj2.a);

        obj2 = obj2.inc();
        System.out.println("obj2.a after second increas "+obj2.a);
    }
}
