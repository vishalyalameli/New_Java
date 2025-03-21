import java.io.*;

class IODemo{
	public static void main (String [] args) throws IOException{

		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Scociety Name:");

		String socName = br.readLine();

		System.out.println("Enter wing name");

		char wing = (char)br.read();

		br.skip(1);

		System.out.println("Enter  flat No" );

		int flatNo = Integer.parseInt(br.readLine());

		System.out.println("Enter flat rent");

		float rent = Float.parseFloat(br.readLine());

		System.out.println(" Society Name :" + socName);
		System.out.println("Wing Name: " + wing);
		System.out.println("Flat No : " + flatNo);
		System.out.println("Rent : "+ rent );
	}
}





