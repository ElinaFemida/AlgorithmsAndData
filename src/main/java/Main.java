import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<Integer> mll = new MyLinkedList<>();

        mll.insertFirst(5);
        mll.insertFirst(6);
        mll.insertFirst(2);
        mll.insertFirst(8);
        System.out.println(mll);

        mll.insertLast(77);
        mll.insertLast(88);
        System.out.println(mll);

        MyLinkedQueue<Integer> queue = new MyLinkedQueue<>();

        queue.add(5);
        queue.add(7);
        queue.add(3);
        queue.add(8);
        for (int i = 0; i < 4; i++) {
            System.out.println(queue.remove());
        }

        Iterator<Integer> iterator = mll.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer x : mll) {
            System.out.println(x);
        }


        MyStack<Integer> stack = new MyStack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        System.out.println(stack.peek());
        System.out.println(stack.remove());
        System.out.println(stack.size());
        }
        }