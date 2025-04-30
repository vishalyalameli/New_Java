
import java.util.*;
public class Pro5 {
    public static void main(String [ ]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");

        int rows = sc.nextInt();
         int num = 1;
         char ch = 'B';

        for(int i = 1 ; i<=rows; i++){
            for(int sp =1 ; sp<= rows-i; sp++){
                System.out.print("\t");
            }
            
            for(int j = 1 ; j<= 2*i -1 ; j++){
                
                if(i % 2 == 1){
                    System.out.print(num + "\t");
                   
                }else{
                    System.out.print(ch + "\t");
                }

            }

            if(i %2 ==1){
                num+=2;
            }else{
                ch+= 2;
            }
            System.out.println();
        }


    }
    
}

/*
 Enter Number
3
                1
        B       B       B
3       3       3       3       3
 */
