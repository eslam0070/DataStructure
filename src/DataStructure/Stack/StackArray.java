package DataStructure.Stack;

public class StackArray<T> {

    int size;
    Object[] ArrayStack;
    int top;
    public StackArray(int size) {
        this.size = size;
        ArrayStack = new Object[size];
        top = -1;
    }

    public void push(Object newItem){
        if (IsFull()) {
            System.out.println("Stack is Full");
            return; //is empty
        }
        top = top+1;
        ArrayStack[top] = newItem;
    }

    public T pop(){
        if (IsEmpty()) {
            System.out.println("Stack is empty");
            return null; //is empty
        }
        T item = (T)ArrayStack[top];
        top = top-1;
        return item;
    }
    public Boolean IsFull(){
        return (top==size-1);
    }

    public Boolean IsEmpty(){
        return (top==-1);
    }
}
