package bsu.comp250;

import java.util.NoSuchElementException;

public class SinglyLinkedList {
    Node head;
    Node tail;
    int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void clear(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void print() {
        if(this.size == 0) {
            System.out.println("List is empty!");
            return;
        }

        String output = "";
        Node current = this.head;

        //traverse the list until we get to null at the end
        while (current != null) {
            output += current.data + " -> ";
            current = current.nextNode;
        }

        System.out.println(output + "null.");
    }

    public void addFirst(String data) {
        //2 cases: list is either empty or not empty
        //either way, we'll have to increment the size!
        if (this.size == 0){
            //if list is empty, the new node will be both the head and tail
            Node newNode = new Node( data, null);
            //Update head and tail accordingly
            this.head = newNode;
            this.tail = newNode;
        } else {
            //if non-empty, new node needs to point to the existing head
            Node newNode = new Node(data, this.head);
            this.head = newNode;
        }
        ++this.size;
    }

    public void addLast(String data) {
        if (this.size == 0) {
            //if list is empty, the new node will be both the head and tail
            Node newNode = new Node( data, null);
            //Update head and tail accordingly
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node newNode = new Node(data, null);
            this.tail.nextNode = newNode;
            this.tail = newNode;
        }
        ++this.size;
    }

    public Node getFirst() throws NoSuchElementException {
        if (this.size == 0) {
            throw new NoSuchElementException("This list is empty!");
        } else {
            return this.head;
        }
    }

    public Node getLast() throws NoSuchElementException {
        if (this.size == 0) {
            throw new NoSuchElementException("This list is empty!");
        } else {
            return this.tail;
        }
    }
}
