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

    public MyTreeNode<E> parent(MyTreeNode<E> node) {
        return node.getParent();
    }

    public MyTreeNode<E> leftChild(MyTreeNode<E> node) {
        return node.getLeftChild();
    }

    public MyTreeNode<E> rightChild(MyTreeNode<E> node) {
        return node.getRightChild();
    }

    public MyTreeNode<E> addLeftChild(MyTreeNode<E> node, E value) throws IllegalArgumentException {
        if (node.getLeftChild() != null) {
            throw new IllegalArgumentException("This node already has a left child");
        }
        MyTreeNode leftChild = createNode(value, node, null, null);
        node.setLeftChild(leftChild);
        size++;
        return leftChild;
    }


    public MyTreeNode<E> addRightChild(MyTreeNode node, E value) throws IllegalArgumentException {
        if (node.getRightChild() != null) {
            throw new IllegalArgumentException("This node already has a right child");
        }
        MyTreeNode rightChild = createNode(value, node, null, null);
        node.setRightChild(rightChild);
        size++;
        return rightChild;
    }

    public E set(MyTreeNode<E> node, E value) {
        E tmp = node.getValue();
        node.setValue(value);
        return tmp;
    }

    public void attach(MyTreeNode node, MyBinaryTree tree1, MyBinaryTree tree2) throws IllegalArgumentException {
        if (node.getLeftChild() != null || node.getRightChild() != null) {
            throw new IllegalArgumentException("This node already has one or more childern");
        }
        size += tree1.size += tree2.size;
        if (!tree1.isEmpty()) {
            root.setParent(node);
            node.setLeftChild(tree1.root);
            tree1.root = null;
            tree1.size = 0;
        }
        if (!tree2.isEmpty()) {
            root.setParent(node);
            node.setRightChild(tree2.root);
            tree2.root = null;
            tree2.size = 0;
        }
    }
}
