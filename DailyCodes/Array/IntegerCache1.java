import java.io.*;
class IntegerCache1{
	public static void main(String [ ] args){

		int x = 127;
		int y = 127;

		if(x==y){
			System.out.println("Equala");
		}else{
			System.out.println("Not Equal");
		}

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
