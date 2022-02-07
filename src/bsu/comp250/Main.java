package bsu.comp250;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node test2 = new Node("asdf", null);
        System.out.println(test2.data);

        Node test1= new Node("jkl;", test2);
        System.out.println(test1.nextNode.data);
    }
}
