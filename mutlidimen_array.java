public class mutlidimen_array {
    public static void main(String args[]) {
        int twod[][] = new int[4][5];
        int k = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                twod[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print (twod[i][j] + " ");
                
            }System.out.println();
        }
    }
}
