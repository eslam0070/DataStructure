package DataStructure.DynamicArray;

import java.util.Arrays;

public class DynamicArray<T> {
    Object[] data;
   /* int[] data;*/
    int size;

    public DynamicArray() {
        size=0;
        //data = new int[1];
        data = new Object[1];
    }

    public T get(int index){
        return (T) data[index];
    }

    public void set(int element){
        ensureCapacity(size+1);
        data[size++]=element;
    }

    public int getSize(){
         return data.length;
    }

    public void  ensureCapacity(int minCapacity){
        int oldCapacity = data.length;
        if (minCapacity>oldCapacity){
            int newCapacity = oldCapacity*2;
            if (newCapacity<minCapacity) //delete
                newCapacity = minCapacity; // فى بعض الحالات فقط
            data = Arrays.copyOf(data,newCapacity);
        }
    }
}
