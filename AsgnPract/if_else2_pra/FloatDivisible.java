import java.util.*;
class FloatDivisible{
	public static void main(String [ ]args){
          Scanner sc = new Scanner(System.in);

	  System.out.println("Enter the float number");

	  float floatNum = sc.nextFloat();

	  if(floatNum % 6 ==0){
		  System.out.println(floatNum + "is divisible by "+6); //12
	}else{
		System.out.println(floatNum + "is not divisible by"+6); //89.96
	}
}
}

