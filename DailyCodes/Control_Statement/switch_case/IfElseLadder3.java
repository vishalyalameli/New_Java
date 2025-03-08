class IfElseLadder3{
	public static void main(String [] args){
		int x = 119;
		int y = 20;
		int z = 50;

		if(x > y && x > z){
			System.out.println( x + "is greater");
		}else if( y > z){
			System.out.println( y + "is  greater");
		}else{
			System.out.println( z + "is greater");
		}
	}
}
