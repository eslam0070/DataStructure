package DataStructure.Stack;

public class NodeStack<T> {

    T value;
    NodeStack next;

    public NodeStack(T value, NodeStack next) {
        this.value = value;
        this.next = next;
    }
}
