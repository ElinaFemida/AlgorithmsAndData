public class Main {
    public static void main(String[] args) {

        //task 1
        String str = "Hello world!";
        ReverseStack<Character> stack = new ReverseStack<>(str.length());
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            stack.push(ch[i]);
        }
        System.out.println("Before reverse: " + str);
        System.out.print("After reverse: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(stack.pop());
        }
    }
}
