import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTreeNodeTest {
    @Test
    void getValue() {
        MyTreeNode node = new MyTreeNode(42, null, null, null);
        assertEquals(42, node.getValue());
    }

    @Test
    void setParent() {
        MyTreeNode node1 = new MyTreeNode(42, null, null, null);
        MyTreeNode node2 = new MyTreeNode(32, null, null, null);
        node1.setParent(node2);
        assertEquals(node2, node1.getParent());
    }
}
