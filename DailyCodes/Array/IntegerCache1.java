import java.io.*;
class IntegerCache1{
	public static void main(String [ ] args){

		Integer x = 128;
		Integer y = 128;

		if(x==y){
			System.out.println("Equala");
		}else{
			System.out.println("Not Equal");
		}

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
