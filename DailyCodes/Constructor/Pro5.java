 class parent {
    parent(){
        super();
        System.out.println("parent Constructor");
    }
    
}
class client{
    public static void main(String [] args){
        parent obj1= new parent();

    }
}
