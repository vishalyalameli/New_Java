import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");

        int num = sc.nextInt();
        int count = 0;
        int i = 1;
        while (i <= num) {
            if (num % i == 0) {
                count++;

            }
            i++;
        }
        if (count == 2) {
            System.out.println(num + " is Prime Number");
        } else {
            System.out.println(num + " is not prime Number");
        }
    }
}

// Enter Number
// 7
// 7 is Prime Number
