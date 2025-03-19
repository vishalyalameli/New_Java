import java.util.*;
class Flat1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Socity Name");
		
		String sName =  sc.nextLine(); // only one string name accept after space name will not accept. vishal Nagar  = >  vishal N 
	//	String sName = sc.nextLine();// it will be accept  after string name ex : vishal Nagar	 = > vishal Nagar 

		System.out.println("Enter wName");
		char wing = sc.next().charAt(0); 

		System.out.println("Enter Flat No ");
		int flatNo = sc.nextInt();

		System.out.println("Enter Rent");
		float  flatRent = sc.nextFloat();
		

		System.out.println(sName);
		System.out.println(wing);
		System.out.println(flatNo);
		System.out.println(flatRent);



	}
}
