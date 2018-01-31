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
}
