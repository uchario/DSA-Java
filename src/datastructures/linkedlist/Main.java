package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.append(2);
        myLinkedList.prepend(1);
        myLinkedList.set(1, 7);
        myLinkedList.insert(0, 5);
        myLinkedList.remove(1);
        myLinkedList.reverse();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }


}
