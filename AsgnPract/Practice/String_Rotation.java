 class String_Rotation {
    public static void main(String [] args){
        String str1 = "abcd";
        String str2 = "cdab";

        if(str1.length() != str2.length()){
            System.out.println("Not a Rotation");
        }else{

           String combined = str1 + str1;

           if(combined.contains(str2)){
             System.out.println("Yes it is Rotation");
           }else{
            System.out.println("Not a Rotation");
           }
        }
    }
}