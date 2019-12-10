package DataStructure.LinkedList;

public class LinkedList {

    Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void add(Node newNode){ //O(1)
        newNode.next=head;
        head=newNode;
    }

    public void delete(){ //O(1)
        head=head.next;
    }

    public void Display(){
        Node n = head;
        while(n != null){
            System.out.println(n.value);
            n=n.next;
        }
    }
}
