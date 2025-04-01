class Integer5{
	public static void main(String [ ] args){
		Integer x = 225;
		Integer y = 225;

		if(x == y){
			System.out.println("Equals");
		}else{
			System.out.println("Not equal");
		}
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));

	}
}
