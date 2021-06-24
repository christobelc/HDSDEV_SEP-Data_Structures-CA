package Problem2;

public class Node {

    int value;
    Node left;
    Node right;
    Node parent;

    //constructor for the root
    public Node(int value){
        this.value = value;
        parent = null;
    }

    //Constructor for every other node, with reference to the parent node
    public Node(int value, Node parent) {
        this.value = value;
        this.parent = parent;
    }
}
