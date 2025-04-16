import java.util.Scanner;

public class NumberFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int Num = sc.nextInt();

       

        for (int i = 1; i <= Num; i++) {
            if (Num % i == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Factors of given Number " + Num + " are:");

    } 
}

/*
 

Enter Number
4
1
2
4

 */