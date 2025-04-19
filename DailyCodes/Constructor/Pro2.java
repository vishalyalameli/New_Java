class Demo {
    static  int x =10;

    
}
class  client{
    public static void main(String [ ] args){
        // System.out.println(x);                //    error: cannot find symbol
        System.out.print(Demo.x);   //10
    }
}
