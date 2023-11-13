package assignment.ch05.sub27;

import java.util.HashSet;
import java.util.Set;

public class ReviewSet {
    // Unchecked Warnings 발생
    // Set / HashSet이 모두 Raw Type으로 선언되어 있기 때문임.
    public static void main(String[] args) {
        // Unchecked 경고 발생 안함..
        Set names = new HashSet();

        // UnChecked 경고 발생
        @SuppressWarnings("unchecked")
        Set<String> strings = new HashSet();
    }
}
