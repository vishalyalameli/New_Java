import java.util.Scanner;

class Pro{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for(int  i = 1 ; i<=rows ; i++){
            for(int sp = 1 ; sp<= rows - i ; sp++){
                        System.out.print("/t)");
            }
            
        }



    }
}