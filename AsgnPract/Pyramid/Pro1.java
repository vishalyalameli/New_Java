
import  java.util.*;

public class Pro1 {
    public static void main(String [ ] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int row = sc.nextInt();

        int col =1 ;
        for(int i =1 ; i<=row; i++){
            for(int sp= 1; sp<= row-i; sp++){
                System.out.print(" \t");
            }
            for(int j = 1; j<=col; j++){
                System.out.print("1 \t");
            }
            System.out.println();
            col = col +2;
        }
    }
    
}




// Enter Number
// 4
//                         1
//                 1       1       1
//         1       1       1       1       1
// 1       1       1       1       1       1       1
