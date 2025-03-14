class Vowel1{
	public static void main(String [] args){
		char ch = 'D'; //a

		if( ch == 'a' || ch=='e' || ch=='i'|| ch=='o' || ch == 'u'){
			System.out.println(ch + " is a vowel");
		}else if(ch >='A' && ch <= 'Z'){
			System.out.println( ch + "is  Consonant");
		}else{
			System.out.println(ch + "it is not valid character");
		}
	}
}
