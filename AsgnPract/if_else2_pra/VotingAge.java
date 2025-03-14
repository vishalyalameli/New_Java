import java.util.*;
class VotingAge{
	public static void main(String [] args){
         
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter  Valid Age");

		int age = sc.nextInt();

		if(age >= 18 ){
			System.out.println("valid age for the voting"); //21 ,
		}else{
			System.out.println("Invalid age"); //-31, 17
		}
	}
}


