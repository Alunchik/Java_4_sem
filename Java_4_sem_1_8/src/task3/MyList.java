package task3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyList<T>{
    private List<T> list;
    private Lock lock = new ReentrantLock();

    public MyList(List<T> list, Lock lock) {
        this.list = list;
        this.lock = lock;
    }

    public void add(T o){
        lock.lock();
        try {
            list.add(o);
        } finally {
            lock.unlock();
        }
    }

    public void remove(int ind){
        lock.lock();
        try {
            list.remove(ind);
        } finally {
            lock.unlock();
        }
    }

    public int size(){
        return list.size();
    }

    public T get(int ind){
        return list.get(ind);
    }
}
