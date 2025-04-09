import  java.util.*;

public class Pro4 {

    public  static  void main(String []args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number");

    int row = sc.nextInt();
   
    int col =1 ;
    for(int i =1 ; i<=row; i++){
        int num = 1;
       
        for(int sp= 1; sp<= row-i; sp++){
            System.out.print(" \t");
        }
        for(int j = 1; j<=col; j++){
            System.out.print( num+ " \t");
            num++;
            
        }
        System.out.println();
        col = col +2;
    }
}
    
}
