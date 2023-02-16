package prac3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class MapLock<K, V> implements Map<K, V> {

    private final static Lock lock = new ReentrantLock();
    private volatile Map map = new HashMap();

    @Override
    public int size() {
        lock.lock();
        int size = map.size();
        lock.unlock();
        return size;
    }

    @Override
    public boolean isEmpty() {
        lock.lock();
        boolean empty = map.isEmpty();
        lock.unlock();
        return empty;
    }

    @Override
    public boolean containsKey(Object key) {
        lock.lock();
        boolean contains = map.containsKey(key);
        lock.unlock();
        return contains;
    }

    @Override
    public boolean containsValue(Object value) {
        lock.lock();
        boolean contains = map.containsValue(value);
        lock.unlock();
        return contains;
    }

    @Override
    public V get(Object key) {
        lock.lock();
        V get = (V) map.get(key);
        lock.unlock();
        return get;
    }

    @Override
    public V put(K key, V value) {
        lock.lock();
        V put = (V) map.put(key, value);
        lock.unlock();
        return put;
    }

    @Override
    public V remove(Object key) {
        lock.lock();
        V remove = (V) map.remove(key);
        lock.unlock();
        return remove;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        lock.lock();
        map.putAll(m);
        lock.unlock();
    }

    @Override
    public void clear() {
        lock.lock();
        map.clear();
        lock.unlock();
    }

    @Override
    public Set<K> keySet() {
        lock.lock();
        Set<K> keySet = (Set<K>) map.keySet();
        lock.unlock();
        return keySet;
    }

    @Override
    public Collection<V> values() {
        lock.lock();
        Collection<V> value = map.values();
        lock.unlock();
        return value;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        lock.lock();
        Set<Entry<K, V>> entry = map.entrySet();
        lock.unlock();
        return entry;
    }
}
