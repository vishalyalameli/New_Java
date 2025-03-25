import  java.io.*;
class Program{
	public static void main (String [] args)throws IOException{

		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

		System.out.println("Enter Rows");

		int Rows = Integer.parseInt(br.readLine());

		int num = Rows;

		for(int i = 1; i<= Rows; i++){
			
			for(int j = 1 ; j<=Rows; j++){
				System.out.print("$   ");
			}
			num ++;
			System.out.println();
		}
		
	}
}
