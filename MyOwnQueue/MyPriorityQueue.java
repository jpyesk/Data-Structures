package MyOwnQueue;

import java.util.ArrayList;
import java.util.Comparator;

public class MyPriorityQueue<T> {
    private ArrayList<T> elements;
    private Comparator<T> comparator;


    public MyPriorityQueue(Comparator<T> comparator) {
        this.elements = new ArrayList<T>();
        this.comparator = comparator;
    }

    public void add(T element) {
        elements.add(element);
        int index = elements.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (comparator.compare(elements.get(index), elements.get(parentIndex)) >= 0) {
                break;
            }
            T temp = elements.get(index);
            elements.set(index, elements.get(parentIndex));
            elements.set(parentIndex, temp);
            index = parentIndex;
        }
    }

    public T poll() {
        if (elements.isEmpty()) {
            return null;
        }
        T result = elements.get(0);
        T last = elements.remove(elements.size() - 1);
        if (!elements.isEmpty()) {
            elements.set(0, last);
            int index = 0;
            while (index < elements.size()) {
                int leftChildIndex = 2 * index + 1;
                int rightChildIndex = 2 * index + 2;
                if (leftChildIndex >= elements.size()) {
                    break;
                }
                int minIndex = leftChildIndex;
                if (rightChildIndex < elements.size() && comparator.compare(elements.get(rightChildIndex), elements.get(leftChildIndex)) < 0) {
                    minIndex = rightChildIndex;
                }
                if (comparator.compare(elements.get(index), elements.get(minIndex)) <= 0) {
                    break;
                }
                T temp = elements.get(index);
                elements.set(index, elements.get(minIndex));
                elements.set(minIndex, temp);
                index = minIndex;
            }
        }
        return result;
    }

    public T peek() {
        if (elements.isEmpty()) {
            return null;
        }
        return elements.get(0);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }
}
