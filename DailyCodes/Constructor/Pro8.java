class Demo{
	Demo(){
		System.out.println( "No parameter");
	}
	Demo(int x ){
		System.out.println("one Parameter Pass");
	}
        Demo(int x , int y){	
		System.out.println("two Parameter");
	}
	public static void main(String [] args){
		Demo obj1 = new Demo();
		Demo obj2 = new Demo(10);
		Demo obj3 = new Demo(10,20);
	}
}
