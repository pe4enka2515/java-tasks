import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class SetSemaphore<E> implements Set {

    Semaphore sem = new Semaphore(1);

    Set<String> set = new HashSet<String>();

    public SetSemaphore() {
        this.set = new HashSet<>();
    }

    @Override
    public int size() {
        try {
            sem.acquire();
            int size = this.set.size();

            sem.release();
            return size;
        }
        catch (InterruptedException exc) {
            exc.printStackTrace();
            return -1;
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            sem.acquire();
            boolean empty = this.set.isEmpty();

            sem.release();
            return empty;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return false;
        }

    }

    @Override
    public boolean contains(Object o) {
        try {
            sem.acquire();
            if(this.set.contains(o)) {
                sem.release();
                return true;
            }

            sem.release();
            return false;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public Iterator iterator() {
        try {
            sem.acquire();
            Iterator iter = this.set.iterator();

            sem.release();
            return iter;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return null;
        }
    }

    @Override
    public Object[] toArray() {
        try {
            sem.acquire();
            Object[] toArr = this.set.toArray();

            sem.release();
            return toArr;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean add(Object o) {
        try {
            sem.acquire();
            boolean suc = this.set.add(o.toString());

            sem.release();
            return suc;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        try {
            sem.acquire();
            boolean rem = this.set.remove(o);

            sem.release();
            return rem;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean addAll(Collection collection) {
        try {
            sem.acquire();
            boolean sucAll = this.set.add(collection.toString());

            sem.release();
            return sucAll;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public void clear() {
        try {
            sem.acquire();
            set.clear();
            sem.release();
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        try {
            sem.acquire();
            boolean remAll = this.set.removeAll(collection);

            sem.release();
            return remAll;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean retainAll(Collection collection) {
        try {
            sem.acquire();
            boolean retAll = this.set.retainAll(collection);

            sem.release();
            return retAll;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean containsAll(Collection collection) {
        try {
            sem.acquire();
            boolean contAll = this.set.containsAll(collection);

            sem.release();
            return contAll;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return false;
        }
    }

    @Override
    public Object[] toArray(Object[] objects) {
        try {
            sem.acquire();
            Object[] toArrObj = this.set.toArray(objects);

            sem.release();
            return toArrObj;
        } catch (InterruptedException exc) {
            exc.printStackTrace();
            return null;
        }
    }
}
