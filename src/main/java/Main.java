public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>();

        chm.put(11, "eleven");
        chm.put(22, "twenty-two");
        chm.put(33, "thirty-three");
        chm.put(44, "forty-four");
        chm.put(55, "fifty-five");
        chm.put(66, "sixty-six");
        chm.put(77, "seventy-seven");
        chm.put(88, "eighty-eight");
        chm.put(99, "ninety-nine");


        System.out.println(chm);

        chm.delete(99);

        System.out.println(chm);
        System.out.println("__________");

        chm.put(99, "ninety_nine");

        System.out.println(chm);

    }
}