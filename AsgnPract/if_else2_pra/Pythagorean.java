import java.util.*;
class  Pythagorean{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter a vlue");
		int a = sc.nextInt();

		System.out.println("Enter  b  Value");
		int b = sc.nextInt();

		System.out.println("Enter c Value");
		int c = sc.nextInt();

		if( (a *a ) + ( b * b ) ==(c * c)){
			System.out.println(" it is Pythogran triplet");
		}else {
			System.out.println("it not Pythogran triplet");
			}
		sc.close();
	}
}


