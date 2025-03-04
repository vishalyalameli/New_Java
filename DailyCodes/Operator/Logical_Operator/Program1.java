class Program1{
	public static void main(String [] args){
		int x= 10;
		int y= 20;

		boolean result = (++x < --y) || (x++ < --y);
		System.out.println(result);
		System.out.println(x);
		System.out.println(y);
	}
	
}
//true 
//11
//19
