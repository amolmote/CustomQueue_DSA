package queue.customqueue;

public class QueueMain {

    public static void main(String[] args) throws Exception {
        //test all the queue code here


        //CustomQueue queue=new CustomQueue(4);
        CircularQueue queue=new CircularQueue(4);

        queue.insert(12);
        queue.insert(20);
        queue.insert(99);
        queue.insert(23);

        queue.display();
//        System.out.println();
        System.out.println(queue.remove());

      queue.display();

        System.out.println(queue.remove());

        queue.display();

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        String str=new String();
    }
}
