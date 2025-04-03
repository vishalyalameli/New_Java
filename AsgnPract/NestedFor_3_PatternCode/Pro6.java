class ReversePattern{
	public static void main(String [ ] args){
		int rows = 4;
		int num = rows *4;

		for(int i = 1; i<=rows; i++){
			for(int j = 1; j<=4; j++){
				System.out.print(num + "\t");
				num--;
			}
			System.out.println();
		}
	}
}

