import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int balancedTrees = 0;
        int trees = 2000000;

        for (int i = 0; i < trees; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int value = 0;
            while (map.height() < 6) {
                value = random.nextInt(201) - 100;
                map.put(value, value);
            }
            map.delete(value);
            if (map.isBalanced())
                balancedTrees++;
        }
        System.out.println("Процент сбалансированных деревьев = " + (double) balancedTrees / trees * 100 + "% :");
        System.out.println(balancedTrees + " из " + trees);
    }
}
