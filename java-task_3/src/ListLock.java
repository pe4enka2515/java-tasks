import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ListLock<E> implements List {

    List<Main> list = new ArrayList<>();

    private static final Lock lock = new ReentrantLock();

    @Override
    public int size() {
        lock.lock();
        int x =list.size();
        lock.unlock();
        return x;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean x =list.isEmpty();
        lock.unlock();
        return x;
    }

    @Override
    public boolean contains(Object o) {
        lock.lock();
        boolean x =list.contains(o);
        lock.unlock();
        return x;
    }

    @Override
    public Iterator iterator() {
        lock.lock();
        Iterator x =list.iterator();
        lock.unlock();
        return x;
    }

    @Override
    public Object[] toArray() {
        lock.lock();
        Object[] x =list.toArray();
        lock.unlock();
        return x;
    }

    @Override
    public boolean add(Object o) {
        lock.lock();
        boolean x = list.add((Main) o);
        lock.unlock();
        return x;
    }

    @Override
    public boolean remove(Object o) {
        lock.lock();
        boolean x =list.remove(o);
        lock.unlock();
        return x;
    }

    @Override
    public boolean addAll(Collection collection) {
        lock.lock();
        boolean x =list.addAll(collection);
        lock.unlock();
        return x;
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        lock.lock();
        boolean x =list.addAll(i, collection);
        lock.unlock();
        return x;
    }

    @Override
    public void clear() {
        lock.lock();
        list.clear();
        lock.unlock();
    }

    @Override
    public Object get(int i) {
        lock.lock();
        Object x =list.get(i);
        lock.unlock();
        return x;
    }

    @Override
    public Object set(int i, Object o) {
        lock.lock();
        Object x =list.set(i, (Main) o);
        lock.unlock();
        return x;
    }

    @Override
    public void add(int i, Object o) {
        lock.lock();
        list.add(i, (Main) o);
        lock.unlock();
    }

    @Override
    public Object remove(int i) {
        lock.lock();
        Object x =list.remove(i);
        lock.unlock();
        return x;
    }

    @Override
    public int indexOf(Object o) {
        lock.lock();
        int x =list.indexOf(o);
        lock.unlock();
        return x;
    }

    @Override
    public int lastIndexOf(Object o) {
        lock.lock();
        int x =list.lastIndexOf(o);
        lock.unlock();
        return x;
    }

    @Override
    public ListIterator listIterator() {
        lock.lock();
        ListIterator x =list.listIterator();
        lock.unlock();
        return x;
    }

    @Override
    public ListIterator listIterator(int i) {
        lock.lock();
        ListIterator x =list.listIterator(i);
        lock.unlock();
        return x;
    }

    @Override
    public List subList(int i, int i1) {
        lock.lock();
        List x =list.subList(i, i1);
        lock.unlock();
        return x;
    }

    @Override
    public boolean retainAll(Collection collection) {
        lock.lock();
        boolean x =list.retainAll(collection);
        lock.unlock();
        return x;
    }

    @Override
    public boolean removeAll(Collection collection) {
        lock.lock();
        boolean x =list.removeAll(collection);
        lock.unlock();
        return x;
    }

    @Override
    public boolean containsAll(Collection collection) {
        lock.lock();
        boolean x =list.containsAll(collection);
        lock.unlock();
        return x;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        lock.lock();
        Object[] x =list.toArray(objects);
        lock.unlock();
        return x;
    }
}
