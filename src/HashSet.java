import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.HashMap;
import java.util.*;

public class HashSet<E> implements Set<E> {

    private static final Object PRESENT = new Object();

    private transient HashMap<E, Object> map;

    public HashSet() {
        map = new HashMap<>();
    }

    //__________________________________________________________________________________________________________________

    //1.
    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;
    }

    //2
    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    //3
    @Override
    public int size() {
        return map.size();
    }

    //4
    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    //5
    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    //6
    @Override
    public boolean addAll(Collection<? extends E> c) {
        boolean modified = false;
        for (E e : c)
            if (add(e))
                modified = true;
        return modified;
    }

    //7
    @Override
    public boolean containsAll(Collection<?> c) {
        return map.keySet().containsAll(c);
    }

    //8
    @Override
    public boolean retainAll(Collection<?> c) {
        boolean modified = false;
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (!c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }

    //9
    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object o : c) {
            if (remove(o))
                modified = true;
        }
        return modified;
    }

    //10
    @Override
    public void clear() {
        map.clear();
    }

    //11
    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    //_____________________________________________________________________________________________________________
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    public void printAll() {
        System.out.print("The set contains: ");
        for (Object element : map.keySet()) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}