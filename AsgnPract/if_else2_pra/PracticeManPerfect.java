import java.util.*;
class PracticeManPerfect{
	public static  void main(String [] args){

		Scanner sc = new Scanner(System.in);
                 
		System.out.println("It is Myself Challenge");

		System.out.println(" Enter the number  of hours you practice  daily :");

	         int hours = sc.nextInt();

		 if(hours >=5){
			 System.out.println("Excellent ! You are  on  your  way  to  mastering  your skill.");
		 }else if(hours >=2){
			 System.out.println("Good  job !  keep Practicing Consistently to achieve your goal.");
		 }else{
			 System.out.println("You need to  practice  more to improve and  reach  your  goal.");
		 }
	}
}



