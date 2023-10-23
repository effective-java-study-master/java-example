package ch02.sub07;

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;

import java.util.HashMap;

class Item7 {
//    @DisplayName("아래는 HashMap으로 작성된 코드 이다. WeakHashMap 으로 변경 후 key2, key3을 제거 후 출력하라.")
//    @Test
    void item7_answer() {
        final HashMap<Integer, String> hashMap = new HashMap<>();

        Integer key1 = 1000;
        Integer key2 = 2000;
        Integer key3 = 3000;

        hashMap.put(key1, "test1");
        hashMap.put(key2, "test2");
        hashMap.put(key3, "test3");

        hashMap.entrySet().forEach(System.out::println);
    }
}