package MyOwnArrayList;

import java.util.Arrays;

public class MyArraylist<T> {
    Object[] elements;
    private int size = 0;
    private final int default_capacity = 10;

    public MyArraylist(){
        this.elements = new Object[default_capacity];
    }
    public int size(){
        return size;
    }
    public void add(T value){
        if (size == default_capacity) {
            int newsize = elements.length * 2;
            elements = Arrays.copyOf(elements, newsize);
        }
        elements[size++] = value;
    }
    public T get(int index){
        return (T) elements[index];
    }
    public void remove(T value){
        Object[] secondarr = new Object[default_capacity];
        int cnt = 0;
        for (int z = 0; z <elements.length ; z++) {
            if (secondarr[z] != value){
                secondarr[cnt++] = elements[z];
            }
            elements = secondarr;
        }
    }

}
