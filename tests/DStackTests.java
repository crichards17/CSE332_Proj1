import org.junit.*;
import java.util.EmptyStackException;
import static org.junit.Assert.*;

public abstract class DStackTests {
    protected abstract DStack getStack();

    @Test
    public void testIsEmpty() {
        DStack testStack = this.getStack();
        assertTrue( testStack.isEmpty() );
        testStack.push( 1.0 );
        assertFalse( testStack.isEmpty() );
    }

    @Test
    public void testPeek() {
        DStack testStack = this.getStack();
        assertThrows(EmptyStackException.class, testStack::peek);
        testStack.push( 1.0 );
        assertEquals( 1.0, testStack.peek(), 0.001 );
    }

    @Test
    public void testPush() {
        DStack testStack = this.getStack();
        testStack.push( 2.0 );
        assertEquals( 2.0, testStack.peek(), 0.001 );
        testStack.push( 4.0 );
        assertEquals( 4.0, testStack.peek(), 0.001 );
    }

    @Test
    public void testPop() {
        DStack testStack = this.getStack();
        testStack.push( 1.0 );
        testStack.push( 2.0 );
        assertEquals( 2.0, testStack.pop(), 0.001 );
        assertEquals( 1.0, testStack.pop(), 0.001 );
        assertThrows(EmptyStackException.class, testStack::pop);
        testIsEmpty();
    }
}