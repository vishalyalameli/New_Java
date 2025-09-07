class StringRotation {
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

/*
 Yes it is Rotation  

 Problem of the Day:
“Write a Java program to check if one string is a rotation of another.”
 Asked in Infosys, Cognizant, Capgemini interviews.
 What is String Rotation?
A string B is a rotation of string A if you can shift characters in A and get B.
Example: A = "ABCD" → rotations → "BCDA", "CDAB", "DABC".  
 

 What is contains in Java?

In Java, contains is a method of the String class:
It checks whether a given sequence of characters (substring) exists inside the string.

Returns true if found, false if not.
 */