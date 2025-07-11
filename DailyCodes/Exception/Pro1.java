 class Pro1 {
    public static void main(String [] args){
        int arr[]  = {10,20,30,40,50};
        System.out.println(arr[3]);
        //System.out.println(arr[5]);

        String str = "Kanha";

        System.out.println(str.charAt(3));
        System.out.println(str.charAt(5));


    }
    
}

/*
 40
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at Pro1.main(Pro1.java:5)

        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
        at java.base/java.lang.String.charAt(String.java:1519)
        at Pro1.main(Pro1.java:10)
 */