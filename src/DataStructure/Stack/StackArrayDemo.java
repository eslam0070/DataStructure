package DataStructure.Stack;

public class StackArrayDemo {

    public static void main(String[] args) {
        System.out.println("\n"+"Stack Array");
        StackArray<Integer> stack = new StackArray<>(10);
        stack.push(11);
        stack.push(12);
        stack.push(21);
        System.out.println("Top: "+stack.top);
        System.out.println(stack.pop());
        System.out.println("Top: "+stack.top);

        System.out.println("\n"+"Dynamic Stack Array");
        //Dynamic Stack Array
        StackArrayDynamic<Integer> data = new StackArrayDynamic<>(3);
        data.push(111);
        data.push(122);
        data.push(211);
        System.out.println("Top: "+data.top);
        System.out.println("Size: "+data.ArrayStack.length);
        data.push(2117);
        System.out.println("Size: "+data.ArrayStack.length);
        System.out.println(data.pop());
        System.out.println("Top: "+data.top);

    }
}
