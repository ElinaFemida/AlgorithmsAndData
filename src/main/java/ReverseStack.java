//for task 1

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.EmptyStackException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReverseStack<T> {
    private T[] list;
    private int size;

    public ReverseStack(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("capacity: " + size);
        }
        list = (T[]) new Object[size];
    }

    public void push(T item) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[size] = item;
        size++;
    }

    public T pop() {
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void reCapacity(int newCapacity) {
        T[] tempArr = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }
}
