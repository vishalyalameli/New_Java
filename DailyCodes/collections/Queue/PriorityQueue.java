import java.util.*;
public class PriorityQueue {
    public static void main(String [] args){
        PriorityQueue pq = new PriorityQueue();

        pq.Offer(40);
        pq.offer(30);
        pq.offer(20);
        pq.offer(10);
        
        System.out.println(pq);

        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }


    }
    
}
