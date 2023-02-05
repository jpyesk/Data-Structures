package MyOwnQueue;
import java.util.ArrayList;
// first in first out data structure,
public class MyQueueWithArrayList<T> {
    private ArrayList<T> data;

    public MyQueueWithArrayList() {
        data = new ArrayList<T>();
    }
    public void enqueue(T item) {
        data.add(item);
    }

    public T dequeue() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data.remove(0);
    }

    public T peek() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return data.get(0);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}

