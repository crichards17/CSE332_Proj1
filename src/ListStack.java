import java.util.EmptyStackException;

public class ListStack implements DStack {

    private class Node {
        double val;
        Node next;

        Node(double thisVal, Node thisNext) {
            val = thisVal;
            next = thisNext;
        }
    }

    private Node head;

    public ListStack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(double d) {
        head = new Node(d, head);
    }

    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            double headVal = head.val;
            head = head.next;
            return headVal;
        }
    }

    public double peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return head.val;
        }
    }

}