import DefaultAccess.*;
class DemoChild extends Demo{
	DemoChild(){
		System.out.println("DemoChild Constructor");
	//	System.out.println(x); //default   there is default package folder 
		System.out.println(y); // Protected
	}
}
class Client{
	public static void main(String [] args){
		DemoChild obj = new DemoChild();
		//	System.out.println(obj.y);  Protected Eroor come because the  not imediate child
		}
	}

/*
 Demo Constructor 
 */

