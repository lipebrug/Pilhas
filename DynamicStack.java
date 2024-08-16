import java.util.EmptyStackException;

public class DynamicStack<T> {

    private Node<T> top;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public DynamicStack() {
        top = null;
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T value = top.data;
        top = top.next;
        return value;
    }

    public void clear() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}

