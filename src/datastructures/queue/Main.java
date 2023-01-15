package datastructures.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(7);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.enqueue(8);
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
//        myQueue.printQueue();
    }
}
