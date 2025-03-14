import java.util.*;
class ProfitLossSelling{
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Selling Price");

		int SellingPrice = sc.nextInt();

		System.out.println("enter Cost Price");
		int CostPrice = sc.nextInt();

		int result = SellingPrice - CostPrice ;

		if(result >0){
			System.out.println(result +" : Profit");
		}else if(result < 0){
			System.out.println(result +":  Loss");
		}else{
			System.out.println("No Profit No Loss");
		}
	}
}




