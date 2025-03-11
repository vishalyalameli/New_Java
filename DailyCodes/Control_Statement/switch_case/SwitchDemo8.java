class SwitchDemo8{
	public static void main(String [] args){

		double x = 15.5;

		switch((int)x){

			case (int)15.5 : System.out.println("15.5");
				    break;
			case (int)20.5: System.out.println("20.5");
				   break;
			case  (int)35.5: System.out.println("35.5");
				    break;
			default : System.out.println("Mot match");
		}
	}
}
