public class MyTreeNode {
    private int value;
    private MyTreeNode parent;
    private MyTreeNode leftChild;
    private MyTreeNode rightChild;

    public MyTreeNode(int value, MyTreeNode parent, MyTreeNode leftChild, MyTreeNode rightChild) {
        this.value = value;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public int getValue() {
        return value;
    }

    public MyTreeNode getParent() {
        return parent;
    }

    public MyTreeNode getLeftChild() {
        return leftChild;
    }

    public MyTreeNode getRightChild() {
        return rightChild;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setParent(MyTreeNode parent) {
        this.parent = parent;
    }

    public void setLeftChild(MyTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(MyTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
