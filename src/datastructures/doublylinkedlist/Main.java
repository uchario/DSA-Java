package datastructures.doublylinkedlist;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.append(2);
        myDLL.prepend(1);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeLast().value);
//        System.out.println(myDLL.removeFirst().value);
//        System.out.println(myDLL.get(1).value);
//        myDLL.set(1, 5);
        myDLL.insert(1, 9);
        myDLL.remove(1);

        myDLL.printList();
    }
}
