package MyOwnLinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();
        lst.add(23);
        lst.addFirst(52);
        lst.add(2425);
        for (Integer k : lst){
            System.out.println(k);
        }
    }
}
