import java.util.EmptyStackException;

public class GArrayStack<T> implements GStack<T> {
    private int size;
    private int head;
    private T[] stack;


    public GArrayStack() {
        size = 10;
        //Recommended workaround for initializing a generic array
        stack = (T[]) new Object[size];
        head = -1;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public void push(T d) {
        if (head == size -1) {
            expandStack();
        }
        head++;
        stack[head] = d;
    }

    private void expandStack() {
        T[] temp = (T[]) new Object[size * 2];
        //Spec requires manual array copy
        for (int i = 0; i < size; i++) {
            temp[i] = stack[i];
        }
        size = size * 2;
        stack = temp;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T popVal = stack[head];
        head--;
        return popVal;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[head];
    }
}