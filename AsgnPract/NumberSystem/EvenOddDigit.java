import java.util.Scanner;

public class EvenOddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();


        int reversed = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        while (reversed > 0) {
            int digit = reversed % 10;
            if (digit % 2 == 0) {
                System.out.println("Even digit: " + digit);
            } else {
                System.out.println("Odd digit: " + digit + ", square: " + (digit * digit));
            }
            reversed /= 10;
        }
    }
}
