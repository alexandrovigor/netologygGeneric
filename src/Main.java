public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBoxStr = new MagicBox<>(2);
        MagicBox<Integer> magicBoxInt = new MagicBox<>(3);
        System.out.println(magicBoxStr.add("Кольцо"));
        System.out.println(magicBoxStr.add("Серьги"));
        System.out.println(magicBoxStr.add("Цепочка"));
        System.out.println(magicBoxInt.add(5));
        System.out.println(magicBoxInt.add(15));
        System.out.println(magicBoxStr.pick());
        System.out.println(magicBoxInt.pick());

    }
}