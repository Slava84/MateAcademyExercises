package homework_7.storage;

import java.util.ArrayList;
import java.util.List;

public class Storage<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    public void put(K key, V value) {
        keys.add(key);
        values.add(value);
    }

    public V get(K key) {
        if (keys.contains(key)) {
            return values.get(keys.indexOf(key));
        } else return (V) new Box();
    }
}
