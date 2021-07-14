public class Main {
    public static void main(String[] args) {
        //task 1

        System.out.println(" 1 ^ 1 = " + exponentiation(1, 1));
        System.out.println(" 2 ^ 0 = " + exponentiation(2, 0));
        System.out.println(" 3 ^ 2 = " + exponentiation(3, 2));
        System.out.println("-1 ^ 3 = " + exponentiation(-1, 3));
        System.out.println("-4 ^ 2 = " + exponentiation(-4, 2));

        //task 2
        Item[] items = {
                new Item(1, 9),
                new Item(2, 8),
                new Item(3, 7),
                new Item(4, 6),
                new Item(5, 5),
                new Item(6, 9),
                new Item(7, 8),
                new Item(8, 2),
                new Item(9, 6),
                new Item(1, 5)
        };
        Bag bag = new Bag(items);
        int bagSize = 16;
        System.out.println(bag.findMaxSum(items.length - 1, bagSize));
    }

    private static double exponentiation(double num, int power) {
        if (num == 0 && power <= 0) {
            throw new ArithmeticException("Exponentiation is not possible");
        }
        if (power == 0) {
            return 1;
        } else {
            return num * exponentiation(num, --power);
        }
    }
}