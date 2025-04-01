import java.util.*;
class Pro8{
	public static void main(String [ ] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");

		int Rows = sc.nextInt();

		
		int num = 1;
		for(int i = 1; i<=Rows; i++){
			
			for(int j = 1; j<= Rows; j++){

				if(num % 2 ==1){

				System.out.print((num * num) + " \t");
				
				}else{
					System.out.print( num + " \t");
				}
				num ++;
			}
			System.out.println();
		}
	}

}
// 4
// 1  2    9     4
// 25  6   :wq
// 49      8
// 169  14  225  16
