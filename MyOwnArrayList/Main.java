package MyOwnArrayList;


public class Main {
    public static void main(String[] args) {
        MyArraylist<Integer> lst = new MyArraylist<>();
       lst.add(22);
       lst.add(23);
       lst.add(24);
       lst.add(25);
       lst.add(26);
       lst.add(27);

        for (int i = 0; i < lst.size(); i++) {
            System.out.println(lst.get(i));

        }
        
    }
}
