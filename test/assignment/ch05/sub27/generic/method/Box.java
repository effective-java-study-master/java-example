package assignment.ch05.sub27.generic.method;


// generic Type 인 Box class
public class Box<T> {
    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
