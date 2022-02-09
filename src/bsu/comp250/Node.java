package bsu.comp250;

public class Node<T> {
    //a field for the string data
    //a field for the Node pointer
    T data;
    Node<T> nextNode;

    public Node(T newData, Node<T> newNextNode) {
        //set the value of data and nextNode using the supplied arguments
        this.data = newData;
        this.nextNode = newNextNode;

    }
}
