package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.getTop();
        myStack.getHeight();

        myStack.push(5);
        myStack.pop();
        myStack.printStack();
    }
}
