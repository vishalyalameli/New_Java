class Calculator{
	public static void main(String [] args){

		int num1 = 7;
		int num2 = 2;

		char operator = '*';
		int result = 0 ; 

		switch(operator){
			case '+': // 5 , 6 = 11 
				result = num1 + num2 ;
				break;
								
			case '-':
				result = num1 - num2;
				break;
				
			case '*':
			       result =  num1 * num2;
		                break;
			case '/':
				result = num1 / num2;
				 break;

			case '%':
				 result = num1 % num2 ;
				 break;
			default: System.out.println("Invalid Input");
				 return;
	
		}
		System.out.println("Result : " + result);

	}
}
