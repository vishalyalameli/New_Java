class Demo{
	private int x = 10;
	  Demo(){
		System.out.println("Demo Constructor");
		System.out.println(x);

	}
	
}
class DemoChild extends Demo{
               DemoChild(){
		System.out.println("DemoChild Constructor");
		System.out.println(x);
	}
}
class Client{
	public static void main(String [] args){
		Demo d = new Demo();
		System.out.println(d.x);

	         DemoChild obj =  new DemoChild();
   	   System.out.println(obj.x);
	}
}
// o/p:
//

// Pro.java:13: error: x has private access in Demo
//                 System.out.println(x);
//                                    ^
// Pro.java:19: error: x has private access in Demo
//                 System.out.println(d.x);
//                                     ^
// Pro.java:22: error: x has private access in Demo
//                  System.out.println(obj.x);
//                                        ^
// 3 errors










