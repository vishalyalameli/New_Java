class SwitchDemo2{
	public static void main(String [] args){
		char ch = 'A';

		switch(ch){
			case 'A' : System.out.println("A");
				   break;

			case 'B' : System.out.println("B");
		         case 'C' : System.out.println("C");
		         case 'D' : System.out.println("D");
			 default : System.out.println("Invalid character");
		}
	}
}
