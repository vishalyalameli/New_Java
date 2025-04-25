class Parent {
	Parent(){
		System.out.println("In parent Constructor");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("in child Constructor");
	}
}
class client{
	public static void main(String [] args){
		Parent p = new Parent();
		Child ch = new Child();
	
	}
}
