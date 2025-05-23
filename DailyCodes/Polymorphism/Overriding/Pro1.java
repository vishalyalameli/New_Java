class Parent{
	Parent(){
		System.out.println("Parent Constructor");
	}
	void career(){
		System.out.println("Doctor/Engg");
	}
	void marry(){
		System.out.println("Alia Bhat");
	}
}
class Child extends Parent{
	Child(){
	//	super();
		System.out.println("Child Constructor");
	}
//	void career(){
//		System.out.println("Doctor");
//	}
	void marry(){
		System.out.println("Disha Patni");
	}
}
class Client{
	public static void main(String [] args){
		Parent obj = new Child();
		obj.career();
		obj.marry();
	}
}

