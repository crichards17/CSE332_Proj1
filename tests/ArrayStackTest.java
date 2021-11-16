import org.junit.*;
import static org.junit.Assert.*;

public class ArrayStackTest extends DStackTests {

    @Override
    protected DStack getStack() {
        return new ArrayStack();
    }

    @Test
    public void testResize() {
        ArrayStack testStack = new ArrayStack();
        for (int i = 0; i < ArrayStack.defaultSize + 1; i++) {
            testStack.push(i);
            assertEquals( i, testStack.peek(), 0.001);
        }
        assertEquals(testStack.getSize(), ArrayStack.defaultSize * 2);
    }
}