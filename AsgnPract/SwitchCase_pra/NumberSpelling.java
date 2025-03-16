class NumberSpelling{
	public static void main(String [] args){
		int num = 6;

		if(num >5){
			System.out.println( num + " is greater than 5.");
		}else{
			switch(num){
				case  0: System.out.println("zero");
					 break;
				case 1 : System.out.println("one");
					 break;
				case 2: System.out.println("Two");
					break;
				case  3:System.out.println("Three");
					break;
				case 4 :System.out.println("Four");
					break;
				case 5 : System.out.println("Five");
					 break;

				default: System.out.println("Invalid Input");
			}
		}
	}
}
