package assignment.ch04.sub20.sub_assgin;

import java.util.Map;

public abstract class AbstractCustomMapEntry3<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    @Override
    public K getKey()  {
        return key;
    }

    @Override
    public V getValue()  {
        return value;
    }

    @Override
    public V setValue(V value) {
        return value;
    }

    public abstract void willBeImplemented();

    public void CustomMapEntry_모음집() {
        willBeImplemented();
        getKey();
        getValue();
        setValue(value);
    }
}
//