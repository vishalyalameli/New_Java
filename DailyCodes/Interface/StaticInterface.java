interface Demo{
    static void fun(){
        System.out.println("In fun");
    }
    void run();
}
class DemoChild1 implements Demo{
    public void run(){
        System.out.println("In run- Demochild");
    }

}

class DemoChil2 implements Demo{
     public void run(){
        System.out.println("In run-DemoChild1");
     }
}

class Client{
    public static void main(String [] args){
        Demo obj = new DemoChild1();
        //obj.fun();
        obj.run();

        Demo.fun();
    }
}
