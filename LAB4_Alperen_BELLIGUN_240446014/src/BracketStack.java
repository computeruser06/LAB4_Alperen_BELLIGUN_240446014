/**
 *
 * Name Surname:    Alperen BELLİGÜN
 * Student ID:    240446014
 * Date:    26.10.2026
 */

public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null; // next is null at first
        }
    }

    private Node top;

    public BracketStack() {
        top = null; // stack is empty at start
    }

    // TODO 1: Add an element to the top of the stack
    public void push(char value) {
        Node newNode = new Node(value); // I create a new node
        newNode.next = top; // connect newNode to the current top
        top = newNode; // update top
    }

    // TODO 2: Remove and return the top element
    public char pop() {
        if (isEmpty()) {
            return ' '; // return empty space if stack has no elements
        }

        char savedData = top.data; // save the top data
        top = top.next; // After saving top.data, the new top should be the node that comes after the current top.
        return savedData; // return it
    }

    // TODO 3: Return the top element without removing it
    public char peek() {
        // Control if the stack is empty; if it is, then return null (empty space)
        if (isEmpty()) {
            return ' ';
        }
        // if not return the data of the top
        return top.data;
    }

    // TODO 4: Check whether the stack is empty
    public boolean isEmpty() {
        // if top is null, it means empty
        return top == null;
    }
}