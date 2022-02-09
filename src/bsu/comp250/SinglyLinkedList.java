package bsu.comp250;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> {
    Node<T> head;
    Node<T> tail;
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
        Node<T> current = this.head;

        //traverse the list until we get to null at the end
        while (current != null) {
            output += current.data + " -> ";
            current = current.nextNode;
        }

        System.out.println(output + "null.");
    }

    public void addFirst(T data) {
        //2 cases: list is either empty or not empty
        //either way, we'll have to increment the size!
        if (this.size == 0){
            //if list is empty, the new node will be both the head and tail
            Node<T> newNode = new Node<T>( data, null);
            //Update head and tail accordingly
            this.head = newNode;
            this.tail = newNode;
        } else {
            //if non-empty, new node needs to point to the existing head
            Node<T> newNode = new Node<T>(data, this.head);
            this.head = newNode;
        }
        ++this.size;
    }

    public void addLast(T data) {
        if (this.size == 0) {
            //if list is empty, the new node will be both the head and tail
            Node<T> newNode = new Node<T>( data, null);
            //Update head and tail accordingly
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node<T> newNode = new Node<T>(data, null);
            this.tail.nextNode = newNode;
            this.tail = newNode;
        }
        ++this.size;
    }

    public Node<T> getFirst() throws NoSuchElementException {
        if (this.size == 0) {
            throw new NoSuchElementException("This list is empty!");
        } else {
            return this.head;
        }
    }

    public Node<T> getLast() throws NoSuchElementException {
        if (this.size == 0) {
            throw new NoSuchElementException("This list is empty!");
        } else {
            return this.tail;
        }
    }

    public void removeFirst() throws NoSuchElementException{
        if (this.size == 0) {
            throw new NoSuchElementException("This list is empty!");
        } else if (this.size == 1) {
            this.clear();
        } else {
            this.head = this.head.nextNode;
            --this.size;
        }
    }

    public void removeLast() throws NoSuchElementException{
        if (this.size == 0) {
            throw new NoSuchElementException("This list is empty!");
        } else if (this.size == 1) {
            this.clear();
        } else {
            Node<T> current = this.head;
            while (current.nextNode != this.tail) {
                current = current.nextNode;
            }
            //System.out.println(current.data);
            current.nextNode = null;
            this.tail = current;
            --this.size;
        }
    }
}
