import java.util.EmptyStackException;

public class StaticStack<T> {

    private int top;
    private T[] data;

    public StaticStack(int size) {
        top = -1;
        data = (T[]) new Object[size];
    }

    public void push(T value) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        data[++top] = value;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return data[top--];
    }

    public void clear() {
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
