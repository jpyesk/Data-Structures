package MyOwnLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> lst = new MyLinkedList<>();
        lst.addFirst(23);
        lst.addLast(24);
        lst.addLast(25);
        lst.addLast(26);
        while(!lst.isEmpty()){
            System.out.println(lst.removeFirst());
        }
        System.out.println("Second way");
        lst.addFirst(23);
        lst.addLast(24);
        lst.addLast(25);
        lst.addLast(26);

        lst.addFirst(22);

        while(!lst.isEmpty()){
            System.out.println(lst.removeFirst());
        }
    }
}
