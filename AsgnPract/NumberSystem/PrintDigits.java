import java.util.Scanner;

public class PrintDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        System.out.println("Digits in the number are:");

        while (num > 0) {
            int digit = num % 10;  // Extract the last digit
            System.out.print(digit + ",");  // Print the digit
            num /= 10;  // Remove the last digit
        }
    }
}

// Enter a number:
// 1234
// Digits in the number are:
// 4,3,2,1,