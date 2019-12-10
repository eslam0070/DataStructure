package DataStructure.Stack;

import java.util.Arrays;

public class StackArrayDynamic<T> {
    int size;
    Object[] ArrayStack;
    int top;
    public StackArrayDynamic(int size) {
        this.size = size;
        ArrayStack = new Object[size];
        top = -1;
    }



    public void push(Object newItem){
       /* if (IsFull()) {
            System.out.println("Stack is Full");
            return; //is empty
        }*/
       ensureCapacity(top+2);
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


    public void  ensureCapacity(int minCapacity){
        int oldCapacity = ArrayStack.length;
        if (minCapacity>oldCapacity){
            int newCapacity = oldCapacity*2;
            if (newCapacity<minCapacity) //delete
                newCapacity = minCapacity; // فى بعض الحالات فقط
            ArrayStack = Arrays.copyOf(ArrayStack,newCapacity);
        }
    }
    public Boolean IsFull(){
        return (top==size-1);
    }

    public Boolean IsEmpty(){
        return (top==-1);
    }
}
