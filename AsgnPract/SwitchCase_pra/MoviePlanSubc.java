import java.util.*;
class MoviePlanSubc{
	public static void main(String [] args){
                 Scanner sc = new Scanner(System.in);
                    

		 System.out.println("Enter Your Plan: ");
		 String ch = sc.nextLine();
		 



		switch (ch){
			case "Silver": System.out.println("For the Silver plan price is 399");
				       break;
			case "Gold": System.out.println("For Gold plan the price is 599");
				     break;
			case "Platinum":System.out.println("For the Platinum plan the price is 799");
					break;
			case "Bronze":System.out.println("For the Bronze plan is 199");
				      break;
			case "Free":System.out.println("for less than 199 , the platform is free with limited access");
				    break;
			default : System.out.println("Invalid Input");
		}
		sc.close();
	}
}

