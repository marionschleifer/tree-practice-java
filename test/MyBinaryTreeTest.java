import com.sun.source.tree.BinaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyBinaryTreeTest {
    @Test
    void size() {
        MyBinaryTree tree = new MyBinaryTree();
        assertEquals(0, tree.getSize());
    }

    @Test
    void setRoot() {
        MyBinaryTree tree = new MyBinaryTree();
        tree.setRoot(42);
        assertEquals(42, tree.getRoot().getValue());
    }

    @Test
    void addLeftChild() {
        MyBinaryTree tree = new MyBinaryTree();
        tree.setRoot(42);
        tree.addLeftChild(tree.root, 31);
        assertEquals(31, tree.root.getLeftChild().getValue());
    }

    @Test
    void addRightChild() {
        MyBinaryTree tree = new MyBinaryTree();
        tree.setRoot(42);
        tree.addRightChild(tree.root, 21);
        assertEquals(21, tree.root.getRightChild().getValue());
        assertEquals(2, tree.getSize());
    }

    @Test
    void setValue() {
        MyBinaryTree tree = new MyBinaryTree();
        tree.setRoot(42);
        tree.root.setValue(31);
        assertEquals(31, tree.root.getValue());
    }

    @Test
    void attach() {
        MyBinaryTree tree = new MyBinaryTree();
        tree.setRoot(1);
        MyBinaryTree subTree1 = new MyBinaryTree();
        subTree1.setRoot(2);
        MyBinaryTree subTree2 = new MyBinaryTree();
        subTree2.setRoot(3);
        tree.attach(tree.root, subTree1, subTree2);
        assertEquals(2, tree.root.getLeftChild().getValue());
        assertEquals(3, tree.root.getRightChild().getValue());
        assertEquals(null, subTree1.root);
        assertEquals(null, subTree2.root);
        assertEquals(3, tree.getSize());
        assertEquals(0, subTree1.getSize());
        assertEquals(0, subTree2.getSize());
    }
}
