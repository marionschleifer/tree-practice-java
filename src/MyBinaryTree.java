public class MyBinaryTree<E> {

    protected MyTreeNode<E> root;
    private int size = 0;

    public MyBinaryTree() {
    }

    public MyTreeNode getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    protected MyTreeNode<E> createNode(E value, MyTreeNode<E> parent, MyTreeNode<E> leftChild, MyTreeNode<E> rightChild) {
        return new MyTreeNode<E>(value, parent, leftChild, rightChild);
    }

    public MyTreeNode setRoot(E value) throws IllegalStateException {
        if (!isEmpty()) {
            throw new IllegalStateException("Tree isn't empty!");
        }
        root = createNode(value, null, null, null);
        size = 1;
        return root;
    }
}
