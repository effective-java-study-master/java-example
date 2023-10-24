package assignment.ch04.sub18;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

class MainTest18 {

    public static void main(String[] args) {
        InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
        s.addAll(List.of("틱", "틱틱", "펑"));

        System.out.println(s.getAddCount()); // 3이 아닌 6이 찍힌다.


        Set<String> s2 = new InstrumentedSetWithForwarding<String>(new HashSet<>());
        s2.addAll(List.of("틱2", "틱틱2", "펑2"));

    }
//    하위 클래스의 구현부가 실행된다
//    하위 클래스의 구현부가 실행된다
//    하위 클래스의 구현부가 실행된다
//    6
}