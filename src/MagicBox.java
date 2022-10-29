import java.util.Random;

public class MagicBox <T>{

    private T[] items;

    private Random random = new Random();

    public MagicBox(int size) {
        items = (T[]) new Object[size];
    }

    public boolean add(Object item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = (T) item;
                System.out.println("Добавили " + item + ".Все ОК!");
                return true;
            }
        }
        System.out.println("Коробка уже полная, " + item + " не лезет=(");
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException(String.format("Коробка заполнена не до конца,добавьте еще %d элемент(ов)", items.length - i));
            }
        }
        int randomInt = random.nextInt(items.length);
        return (items[randomInt]);
    }

}
