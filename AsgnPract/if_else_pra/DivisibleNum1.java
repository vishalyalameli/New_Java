class DivisibleNum1{
	public static void main(String [] args){

		int num = 20;

		if( num  % 7 == 0){
			System.out.println(num  + "  is divisible by "+ 7 );
		}else if( num % 3 == 0){
			System.out.println(num + " is divisible by " + 3);
		}else{
			System.out.println( num + "is  neither divisible  by "+ 3 + "nor by"+ 7 );
			
		}
	}
}
