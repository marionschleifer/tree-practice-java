import javax.xml.soap.Node;

public class MyNode {
    private int value;
    private MyNode parent;
    private MyNode leftChild;
    private MyNode rightChild;

    public MyNode(int value, MyNode parent, MyNode leftChild, MyNode rightChild) {
        this.value = value;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }
}
