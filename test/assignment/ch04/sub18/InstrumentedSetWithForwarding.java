package assignment.ch04.sub18;

import java.util.Collection;
import java.util.Set;

public class InstrumentedSetWithForwarding<E> extends ForwardingSet<E> {
    private int addCount = 0;

    public InstrumentedSetWithForwarding(Set<E> s) { // 생성자
        super(s);
    }

    @Override public boolean add(E e) {
        addCount++;
        System.out.println("here?");
        return super.add(e);
    }

    @Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}