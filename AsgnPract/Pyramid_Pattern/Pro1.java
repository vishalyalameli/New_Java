
import java.util.*;

 class Pro1 {
    public  static void main(String [] args){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int rows = sc.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int s = 1 ; s <=rows -i; s++){
                System.out.println("\t");
            }
               for(int j = 1 ; j<= (2 * i -1); j++ ){
                System.out.println((rows-i+1) + "\t");
               }

               System.out.println();
            }
       


    }
    
}
