package bsu.comp250;

public class Node {
    //a field for the string data
    //a field for the Node pointer
    String data;
    Node nextNode;

    public Node(String newData, Node newNextNode) {
        //set the value of data and nextNode using the supplied arguments
        this.data = newData;
        this.nextNode = newNextNode;

    }
}
