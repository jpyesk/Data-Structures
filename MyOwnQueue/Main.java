package MyOwnQueue;

public class Main {
    public static void main(String[] args) {
//        MyQueueWithArrayList<Integer> queue = new MyQueueWithArrayList<>();
//        queue.enqueue(23);
//        queue.enqueue(24);
//        queue.enqueue(25);
//        queue.enqueue(26);
//        System.out.println("Size is "+queue.size());
//        System.out.println(queue.peek());
//        queue.dequeue();
//        System.out.println(queue.peek());
//        System.out.println("Size is "+queue.size());
        MyQueue<Integer> queue2 = new MyQueue<>();
        queue2.enqueue(13);
        queue2.enqueue(14);
        queue2.enqueue(15);
        queue2.enqueue(16);
        System.out.println("Size is "+queue2.size());
        System.out.println(queue2.peek());
        queue2.dequeue();
        System.out.println(queue2.peek());
        System.out.println("Size is "+queue2.size());

    }
}
