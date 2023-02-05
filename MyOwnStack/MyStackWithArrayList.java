package MyOwnStack;

import java.util.ArrayList;

public class MyStackWithArrayList<T> {
    private ArrayList<T> data;

    public MyStackWithArrayList() {
        data = new ArrayList<T>();
    }

    public void push(T item) {
        data.add(item);
    }

    public T pop() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.remove(data.size() - 1);
    }

    public T peek() {
        if (data.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return data.get(data.size() - 1);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
}
