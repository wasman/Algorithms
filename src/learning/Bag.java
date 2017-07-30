package learning;

import java.util.Iterator;
import java.util.LinkedList;

public class Bag<T> implements Iterable<T> {

    private int size;
    private final LinkedList<T> data = new LinkedList<>();

    public void add(T x) {
        data.add(x);
    }

    public int size() {
        return data.size();
    }


    @Override
    public Iterator<T> iterator() {
        return data.iterator();
    }

}
