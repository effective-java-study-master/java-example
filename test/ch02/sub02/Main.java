package ch02.sub02;
/* 2번 문제 답안
    Q. 빌더 패턴을 이용하여 공변 반환 타이핑을 구현해 보아라.
    - 공변 반환 타입
        JDK 1.5부터 추가
        부모 클래스의 반환 타입은 자식 클래스의 타입으로 변경 가능하다
*/
public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent pc = new Child();

        System.out.println(parent.createNewOne().getClass());
        System.out.println(child.createNewOne().getClass());
        System.out.println(pc.createNewOne().getClass());
    }
}

class Parent {
    protected Parent createNewOne() {
        return new Parent();
    }
}

class Child extends Parent {
    @Override
    public Child createNewOne() {
        return new Child();
    }
}
