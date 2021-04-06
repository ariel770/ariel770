import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
    private final ArrayList<T> tStack;

    public Stack() {
        this(10);
    }

    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10;
        tStack = new ArrayList<T>(initCapacity);

    }

    public void push(T s) {
        tStack.add(s);
    }

    public T pop() {
        if (tStack.isEmpty()) {
            throw new EmptyStackException();
        }
        return tStack.remove(tStack.size() - 1);

    }

}
