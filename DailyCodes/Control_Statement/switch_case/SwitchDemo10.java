class SwitchDemo10{
	public static void main(String [] args){
		String cmpName = "Microsoft";

		switch(cmpName){
			case "Microsoft" ->
					  System.out.println("Bill Gates");
					
			case "Amazon" ->
				       System.out.println("Jeff Bezos");
				      
			case "Tesla"->
				      System.out.println("Elon Musk");
				      
				       case "Apple"->
				      System.out.println("Steve Jobs");
						     

				       default->
					       System.out.println("Trump tatya");
						 
		}
	}
}
// JDK  17 it can be work
//
// JDK 8 ereor compile time
//
// this feature it can be added JDK 12
