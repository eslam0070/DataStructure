package DataStructure.Stack;


public class StackLinkedList {

    NodeStack head;

    public StackLinkedList(NodeStack head) {
        this.head = head;
    }

    public void push(NodeStack newNode){ //O(1)
        newNode.next=head;
        head=newNode;
    }

    public void pop(){ //O(1)
        head=head.next;
    }

    public void Display(){
        NodeStack n = head;
        while(n != null){
            System.out.println(n.value);
            n=n.next;
        }
    }
}
