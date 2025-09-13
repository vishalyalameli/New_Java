import java.util.*;

class QueueMethods{
    public static void main(String [] args){
        Queue queue = new LinkedList<>();
        queue.add("Kanha");
        queue.add("Ashish");
        queue.add("bade");

        System.out.println(queue);
 // offer

        queue.offer("rahul");
        System.out.println(queue);

        


    }
}