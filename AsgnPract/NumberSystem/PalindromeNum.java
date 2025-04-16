import java.util.*;

class  PalindromeNum{
   public static void main(String [ ] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number");

       int num = sc.nextInt();

       int reversed = 0  , temp =num;
       
       while(num>0){
           int digit = num %10;
           reversed = reversed * 10 + digit;
           num /= 10;
       }
       if(temp == reversed){
           System.out.print(reversed+ "is palindrome");

       }else{
           System.out.print(reversed + " is not palindrome");
       }
       
   }
}

/*

Enter Number
121
121is palindrome

Enter Number
123
321 is not palindrome
 
 */
