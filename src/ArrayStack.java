import java.util.EmptyStackException;

public class ArrayStack implements DStack {
    private int size;
    private int head;
    private double[] stack;
    static final int defaultSize = 10;

    public ArrayStack() {
        size = defaultSize;
        stack = new double[size];
        head = -1;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public void push(double d) {
        if (head == size -1) {
            expandStack();
        }
        stack[++head] = d;
    }

    private void expandStack() {
        double[] temp = new double[size * 2];
        //Manual array copy required by spec
        for (int i = 0; i < size; i++) {
            temp[i] = stack[i];
        }
        size = size * 2;
        stack = temp;
    }

    public double pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[head--];
    }

    public double peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[head];
    }

    int getSize() {
        return size;
    }
}