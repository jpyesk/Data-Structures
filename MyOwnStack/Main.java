package MyOwnStack;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(24);
//        stack.push(25);
//        stack.push(26);
//        stack.push(27);
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(7);
        stack2.push(8);
        stack2.push(9);
        stack2.push(10);
        System.out.println(stack2.pop());
        System.out.println(stack2.peek());
    }
}
