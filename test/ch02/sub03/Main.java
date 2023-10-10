package ch02.sub03;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Person p = Person.getInstance(); // 이미 존재하는 객체 리턴
        Person p2 = Person.getInstance();
        System.out.println(p);
        System.out.println(p2);

        System.out.println(Objects.equals(p, p2));
    }
}
