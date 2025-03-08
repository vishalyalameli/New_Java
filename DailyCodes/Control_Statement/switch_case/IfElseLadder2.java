class IfElseLadder2{
	public static void main(String [] args){
		int x = 8;
		int  y = 19;
		int z = 17;
		if( x > y &&  y > z){
			System.out.println( x + "is greater ");
		}else if( y > z){
			System.out.println(y + "is greater ");
		}else{
			System.out.println( z + "is greater");
		}
	}
}
