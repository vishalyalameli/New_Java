class Parent{
	int x = 10;
	Parent(){
		System.out.println("in Parent Constructor");
	}
	void dispParent(){
		System.out.println(x);
	}
}
class Child extends Parent{
	int x = 20;

	Child(){

		System.out.println("In Child Constructor");
	}
	void dispChild(){
		System.out.println(x);
		System.out.println( super.x);
	}
}
class client{
	public static void main(String [] arg){
		Parent p = new Parent();
		p.dispParent();
		Child ch = new Child();
		ch.dispParent();
		ch.dispChild();
	}
}

/* 
parent Constructor
10
Parent constructor
child constructor
10
20
10


*/


