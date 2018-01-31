public class MyTreeNode<E> {
    private E value;
    private MyTreeNode<E> parent;
    private MyTreeNode<E> leftChild;
    private MyTreeNode<E> rightChild;

    public MyTreeNode(E value, MyTreeNode parent, MyTreeNode leftChild, MyTreeNode rightChild) {
        this.value = value;
        this.parent = parent;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public E getValue() {
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

    public void setValue(E value) {
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
