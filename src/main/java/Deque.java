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

    public void insertRight(T item) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }
        size++;
        list[end] = item;
        end = nextIndex(end);
    }

    public void insertLeft(T item) {
        if (isFull()) {
            throw new RuntimeException("queue is full");
        }
        size++;
        list[begin] = item;
        if (--begin < 0) {
            begin = size - 1;
        }
        else begin = begin-1;
    }

    public T removeLeft() {
        T temp = peekFirst();
        size--;
        list[begin] = null;
        if (++begin == size){
            begin = 0;
        }
        else begin = begin+1;
        return temp;
    }

    public T removeRight() {
        T temp = peekLast();
        size--;
        list[end] = null;
        if (--end < 0) {
            end = size - 1;
        }
        else end = end-1;
        return temp;
    }

    public T peekFirst() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[begin];
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        return list[end];
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
