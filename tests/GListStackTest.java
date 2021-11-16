import org.junit.*;
import static org.junit.Assert.*;

public class GListStackTest {
    private GListStack<Double> testStack;

    @Test
    public void testIsEmpty() {
        testStack = new GListStack<>();
        assertTrue( testStack.isEmpty() );
    }

    @Test
    public void testPush() {
        testStack = new GListStack<>();
        testStack.push( 2.0 );
        assertFalse( testStack.isEmpty() );
    }

    @Test
    public void testPop() {
        testStack = new GListStack<>();
        testStack.push( 1.0 );
        testStack.push( 2.0 );
        assertEquals( 2.0, testStack.pop(), 0.001 );
        assertEquals( 1.0, testStack.pop(), 0.001 );
        testIsEmpty();
    }

    @Test
    public void testPeek() {
        testStack = new GListStack<>();
        testStack.push( 1.0 );
        testStack.push( 2.0 );
        assertEquals( 2.0, testStack.peek(), 0.001 );
        testStack.pop();
        assertEquals( 1.0, testStack.peek(), 0.001 );
        assertFalse( testStack.isEmpty() );
    }
}