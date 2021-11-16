import java.util.EmptyStackException;

public class ArrayStack implements DStack {
    private int size;
    private int head;
    private double[] stack;


    public ArrayStack() {
        size = 10;
        stack = new double[size];
        head = -1;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public void push(double d) {
        if (head == size -1) {
            expandStack();
            //Implement helper
        }
        head++;
        stack[head] = d;
    }

    private void expandStack() {
        double[] temp = new double[size * 2];
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
        double popVal = stack[head];
        head--;
        return popVal;
    }

    public double peek() {
        if (isEmpty()) {
        throw new EmptyStackException();
        }
        return stack[head];
    }
}