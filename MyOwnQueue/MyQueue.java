package MyOwnQueue;

public class MyQueue<T> {
    private static final int INITIAL_CAPACITY = 16;
    private T[] data;
    private int head = 0;
    private int tail = 0;

    public MyQueue() {
        data = (T[]) new Object[INITIAL_CAPACITY];
    }

    public void enqueue(T item) {
        if (head == (tail + 1) % data.length) {
            T[] newData = (T[]) new Object[data.length * 2];
            for (int i = 0; i < size(); i++) {
                newData[i] = data[(head + i) % data.length];
            }
            data = newData;
            head = 0;
            tail = size();
        }
        data[tail] = item;
        tail = (tail + 1) % data.length;
    }

    public T dequeue() {
        if (head == tail) {
            throw new IllegalStateException();
        }
        T item = data[head];
        data[head] = null;
        head = (head + 1) % data.length;
        return item;
    }

    public T peek() {
        if (head == tail) {
            throw new IllegalStateException();
        }
        return data[head];
    }

    public int size() {
        return (tail + data.length - head) % data.length;
    }

    public boolean isEmpty() {
        return head == tail;
    }
}
