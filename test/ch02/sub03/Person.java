package ch02.sub03;

public class Person {
    private static final Person PERSON = new Person();

    private Person(){
        // Reflection 방어
        if(PERSON != null) {
            throw new RuntimeException("Can't create Constructor");
        }
    }

    public static Person getInstance(){
        return PERSON;
    }

    // singleton 보장
    private Object readResolve() {
        // 역직렬화로 새로운 인스턴스가 생성되더라도 PERSON 반환하여 싱글턴 보장
        return PERSON;
    }
}
