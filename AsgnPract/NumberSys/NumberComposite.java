import java.util.*;
class NumberComposite{
	public static void main(String [] args ){
		Scanner sc = new  Scanner(System.in);
		System.out.println("Emter Number");

		int num = sc.nextInt();
		int count = 0 ;
		int i = 1;
		while( i <= num){
			if( num % i == 0){
				count ++;
			}
			i++;
		}
		if(count  > 2){
			System.out.println(num +" is  a Composite Number");
		}else{
			System.out.println(num + " is not  a composite Number ");
		}
	}
}

