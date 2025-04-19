class Pro4 {
    static int x = 10;

    static void fun() {
        System.out.println("in fun");
    }
 
    public static void main(int args){

        System.out.println("int wala main");
    }

    public static void main(String[] args) {
        System.out.println(x);
        fun();
       main(10);
    }

}

// 10
// in fun
// int wala main
