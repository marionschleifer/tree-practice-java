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

}
