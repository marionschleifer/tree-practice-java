import com.sun.source.tree.BinaryTree;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyNodeTest {
    @Test
    void getValue() {
        MyNode node = new MyNode(42, null, null, null);
        assertEquals(42, node.getValue());
    }
}
