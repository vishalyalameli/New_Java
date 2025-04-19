 class Demo {
    static int x =10;
    static void  fun(){
        System.out.println("In fun");
    }
    
}
class  client{
    public static void main(String [ ] args){
        System.out.println(Demo.x);             // 10
        Demo.fun();                              //  in fun  
    } 
}
