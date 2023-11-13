package assignment.ch05.sub27.generic.inherit;

public interface Storage<T> {
    void add(T item, int index);
    T get(int index);
}
