class Standard12th{
	public static void main(String [] args){

		double percentage = 60.00;

		if(percentage  >85.00){
			System.out.println( "Medical");// 87.00
		}else if ( percentage <= 85.00 && percentage >75.00){
			System.out.println("Engineering");//77.00
		}else if(percentage <= 75.00 && percentage >=65.00){
			System.out.println(" Pharmacy or bachelor in science");
		}else{
			System.out.println(" Try Next Year OR Start Your Business");//50.00
	}
	}

}

