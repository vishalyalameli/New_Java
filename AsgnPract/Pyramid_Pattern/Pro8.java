import java.util.*;
public class Pro8 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");

        int row =  sc.nextInt();

        for(int i = 1; i<=row ; i++){
            for(int sp = 1; sp<=row-i; sp++){
                System.out.print(" ");
            }

            int num = 1 ;
            for(int j = 1; j<=i; j++){
                System.out.print(num + " ");
                num +=2;
            }

            num -=4;
            for(int j =1; j<i ; j++){
                System.out.print(num + " ");
                num -=2;
            }

            System.out.println();

        }

         sc.close();

    }
    
}

/*

Enter Number3
     1
  1  3 1
1 3  5 3 1

 
 */