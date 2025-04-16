
import java.util.*;
public class CompositeNum {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0 ;
        int i =1;

        while(i<=num){
            if(num % i == 0){
                count++;
            }
            i++;
        }
        if(count > 2){
            System.out.println(num + " is a Composite Number.");
        } else {
            System.out.println(num + " is NOT a Composite Number.");
        }
        

    }
    
}
/*
Enter a number: 7
7 is NOT a Composite Number.


Enter a number: 8
8 is a Composite Number.

 */
