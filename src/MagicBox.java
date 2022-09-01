
import java.util.Random;

public class MagicBox<T> {
    private T[] items;

    private int volume;
    private int cells = 0;
    Random random = new Random();

    public MagicBox(int volume) {
        this.volume = volume;
        this.items = (T[]) new Object[volume];
    }

    public boolean add(T item) {
        for (int x = 0; x < items.length; x++) {
            if (items[x] == null) {
                items[x] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {

        for (int x = 0; x < items.length; x++) {
            if (items[x] == null) {
                cells++;
            }
        }
        if (cells != 0) {
            throw new RuntimeException("Магическая коробка еще не полна, осталось " + cells + " пустых места!");
        } else {
            int randomInt = random.nextInt(items.length);
            System.out.println(items[randomInt]);
            return items[randomInt];
        }
    }
}
