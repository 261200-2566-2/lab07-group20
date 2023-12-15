import java.util.HashMap;

public class HashSet<E> implements Set<E> {

    private static final Object HERE = new Object();

    private HashMap<E, Object> map;

    public HashSet() {
        map = new HashMap<>();
    }

    @Override
    public boolean add(E e) {
        return map.put(e, HERE) == null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == HERE;
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public java.util.Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public void clear() {
        map.clear();
    }

}
