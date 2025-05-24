abstract class Parent{
	int x = 10;
	abstract void fun();
}
class Child extends Parent{
	void fun(){
		System.out.println(x);
	}
}
	class Client{
		public static void main(String [] args){
			Parent obj = new Child();
			obj.fun();
		}
	}


			
				
