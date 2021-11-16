import java.util.EmptyStackException;

public class GListStack<T> implements GStack<T> {

    private class Node<T> {
        T val;
        Node<T> next;

        Node(T thisVal, Node<T> thisNext) {
            val = thisVal;
            next = thisNext;
        }
    }

    private Node<T> head;

    public GListStack() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(T d) {
        head = new Node<T>(d, head);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            T headVal = head.val;
            head = head.next;
            return headVal;
        }
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        } else {
            return head.val;
        }
    }

}