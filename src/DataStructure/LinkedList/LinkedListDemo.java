package DataStructure.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList ls = new LinkedList(new Node<>(12, null));
        ls.add(new Node<>(11,null));
        ls.add(new Node<>(13,null));
        ls.Display();
        System.out.println("\n"+ "After delete");
        ls.delete();
        ls.Display();

    }
}
