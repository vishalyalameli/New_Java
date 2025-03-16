class TrafficLight{
	public static void main(String [] args){

		String ch = "Blue";

		switch(ch){
			case "Red": System.out.println("Stop");
				    break;
			case "Green":System.out.println("GO");
				     break;
			case "Yellow": System.out.println("Alert");
				       break;
			case "Blue":System.out.println("No suc color is present in traffic lights");
				    break;
			default: System.out.println("Invalid Input");
		}
	}
}
