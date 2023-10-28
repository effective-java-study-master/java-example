package assignment.ch3.sub13;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack implements Cloneable{
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = 0;
    }

    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }

    // 원소를 위한 공간을 적어도 하나 이상 여유를 두며, 늘려야하는 경우 두배 이상 늘린다.
    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements, 2*size+1);
        }
    }

    @Override
    public Stack clone() {
        try{
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }

}
