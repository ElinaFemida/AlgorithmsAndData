//task 2
import java.util.Arrays;


public class Deque<T> {
    private T[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int begin;
    private int end;


    public Deque(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("capacity: " + size);
        }
        list = (T[]) new Object[size];
    }

    public Deque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void insert(T item) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public T remove() {
        T temp = peek();
        size--;
        list[begin] = null;
        begin = nextIndex(begin);
        return temp;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[begin];
    }

    private int nextIndex(int index) {
        return (index + 1) % list.length;
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

    @Override
    public String toString() {
        return Arrays.toString(list) + " b = " + begin + " e = " + end;
    }
}
