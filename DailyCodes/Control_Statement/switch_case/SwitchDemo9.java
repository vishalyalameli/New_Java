class SwitchDemo9{
	public static void main(String [] args){
		String cmpName = "Microsoft";

		switch(cmpName){
			case "Microsoft": System.out.println("Bill Gates");
					break;
			case "Amazon": System.out.println("Jeff Bezos");
				      break;
			case "Tesla": System.out.println("Elon Musk");
				      break;
				       case "Apple": System.out.println("Steve Jobs");
						     break;

				       default : System.out.println("Not Match");
						 break;
		}
	}
}
