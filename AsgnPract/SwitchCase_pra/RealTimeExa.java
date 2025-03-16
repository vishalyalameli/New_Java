import java.util.*;
class RealTimeExa{
	public static void main(String [] args){

           Scanner sc = new Scanner(System.in);

	   System.out.println("Welcome to Vishal Restaurant !");
	   System.out.println("1. Burger - $5");
	   System.out.println("2. Pizza - $8");
	   System.out.println("3. Pasta - $7");
	   System.out.println("4. Sandwich - $4");
	   System.out.println("5. Coffe - $3");

	   System.out.println("Enter the item number you want to  order: ");

	   int choice = sc.nextInt();
	   if(choice < 1 ||  choice  > 5){
		   System.out.println("Invalid Choice . please select a valid  Food Type.");
	   }else{
		   switch(choice){
			   case 1 : System.out.println("You Ordered Burger. Enjoy your Food");
				    break;
			   case 2 : System.out.println("You Ordered Pizza . Enjoy Your Food");
				    break;
			   case 3:System.out.println("You ordered Pasta.");
				  break;
			   case 4:System.out.println("You Ordered Sandwich");
				  break;
			   case 5:System.out.println("You Ordered Coffe");
				  break;
		   }
		   sc.close();
	   }
	}
}
