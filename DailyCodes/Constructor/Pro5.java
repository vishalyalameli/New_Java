 class parent {
    parent(){
        super();
        System.out.println("parent Constructor");
    }
    
}
class client{
    public static void main(String [] args){
        parent obj= new parent();

    }
}

//parent Constructor