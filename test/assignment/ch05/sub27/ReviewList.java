package assignment.ch05.sub27;

import java.util.Arrays;

public class ReviewList {

    private int size;

    Object[] elements;

    // Uncheck 경고 제거 불가능하면,
    public <T> T[] toArray(T[] a) {
        if (a.length < size){

            // 매개변수, 생성한 변수 모두 T[]
            @SuppressWarnings("unchecked")
            T[] result = (T[]) Arrays.copyOf(elements, size, a.getClass());
            return result;
//            return (T[]) Arrays.copyOf(elements, size, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, size);
        if (a.length > size)
            a[size] = null;
        return a;
    }

    public static void main(String[] args) {}
}
