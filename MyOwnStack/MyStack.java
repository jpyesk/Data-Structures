package MyOwnStack;

// first in last out data structure (exactly like stacking towers)
public class MyStack<T> {
    private static final int starting_capacity = 16;
    private T[] data;
    private int size =0;

    public MyStack(){
        data = (T[]) new Object[starting_capacity];
    }
    public void push(T item){
        if (size == data.length){
            T[] newdata = (T[]) new Object[data.length*2];
            for (int i = 0; i < size; i++) {
                newdata[i]=data[i];
            }
            data = newdata;
        }
        data[size++] = item;
    }
    public T pop(){
        if (size == 0){
            throw new IllegalStateException();
        }
        T item = data[--size];
        data[size] = null;
        return item;
    }
    public T peek(){
        if (size ==0){
            throw new IllegalStateException();
        }
        return data[size-1];
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

}
