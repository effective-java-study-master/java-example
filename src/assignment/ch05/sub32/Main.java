package assignment.ch05.sub32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    static <T> List<T> pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) { // 랜덤 0~2
            case 0: return Arrays.asList(a, b); // warning:Unchecked generics array creation for varargs parameter
            case 1: return Arrays.asList(a, c); // warning:Unchecked generics array creation for varargs parameter
            case 2: return Arrays.asList(b, c); // warning:Unchecked generics array creation for varargs parameter
        }
        throw new AssertionError();
    }
    public static void main(String[] args) {
        List<String> attrs = pickTwo("좋은", "빠른", "저렴한");
        System.out.println("attrs = " + attrs.toString());
    }
}

