import  java.util.*;
public class Pro4 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int rows = sc.nextInt();

        for(int i = 1; i<=rows; i++){
            for(int sp = 1 ; sp<=rows-i;sp++){
                System.out.print("\t");
            }
              int num = rows;

            for( int j =1; j<= 2*i-1 ; j++){
                System.out.print(num + "\t");
                if( j < i ){
                num-- ;
            }else{
                num++ ;
            }
                 
            }
            System.out.println();

        }
    }
}
    
/*
 Enter Number
4
                        4
                4       3       4
        4       3       2       3       4
4       3       2       1       2       3       4
 */


