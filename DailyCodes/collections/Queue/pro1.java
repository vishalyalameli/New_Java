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

        //peek
        System.out.println(queue.peek());// if empty null

        //element
        System.out.println(queue.element()); // if empty- Exception

        //poll
        System.out.println(queue.remove()); // if empty -excetion

        System.out.println(queue);


        //size
        System.out.println(queue.size());// 2

        //contains
        System.out.println(queue.contains("kanha")); // false

        //clear
        queue.clear();
        System.out.println(queue);



    }
}
