package MyOwnLinkedList;


import java.util.NoSuchElementException;

public class MyLinkedList<T> {

    private Node<T> head;
    private int size;


    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void addFirst(T data){
        Node<T> newnode = new Node<>(data);
        newnode.next = head;
        head = newnode;
        size++;
    }
    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return head.data;
    }
    public T removeFirst(){
        if (isEmpty()){
            return null;
        }
        T data = head.data;
        head = head.next;
        size--;
        return data;
    }
    public void addLast(T data){
        Node<T> newNode = new Node<>(data);
        if (isEmpty()){
            head= newNode;
        }else{
            Node<T> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        Node<T> current = head;
        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }
    public T removeLast(){
        if (isEmpty()){
            return null;
        }
        if (size == 1){
            T data = head.data;
            head = null;
            size--;
            return data;
        }else{
            Node<T> current = head;
            while (current.next.next != null){
                current= current.next;
            }
            T data = current.next.data;
            current.next = null;
            size--;
            return data;
        }
    }


    private static class Node<T>{
        private T data;
        private Node<T> next;
        public Node(T data){
            this.data = data;
            this.next = null;
        }
    }

}
