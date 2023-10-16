package ch02.sub07;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

class Item7 {
    @DisplayName("아래는 HashMap으로 작성된 코드 이다. WeakHashMap 으로 변경 후 key2, key3을 제거 후 출력하라.")
    @Test
    void usedHashMap() {
        final HashMap<Integer, String> hashMap = new HashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;
        Integer key3 = 3000;

        hashMap.put(key1, "test1");
        hashMap.put(key2, "test2");
        hashMap.put(key3, "test3");

        hashMap.entrySet().forEach(System.out::println);
    }

     @Test
    void usedWeakMap() {
        // WeakHashMap 사용
        Map<Integer, String> weakHashMap = new WeakHashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;
        Integer key3 = 3000;

        weakHashMap.put(key1, "test1");
        weakHashMap.put(key2, "test2");
        weakHashMap.put(key3, "test3");

        key2 = null;
        key3 = null;

        System.gc(); // 강제 Garbage Collection

        // WeakHashMap 은 오래 사용되거나 사용되지 않늰다고 판단되는 객체를 GC가 자동으로 제거함
        weakHashMap.entrySet().forEach(System.out::println);
    }

}