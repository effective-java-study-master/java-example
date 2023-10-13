package assignment.ch02.sub03;

public class Coffee {
    public static final Coffee INSTANCE = new Coffee();

    //private 정의를 통해 생성자를 통한 객체 생성을 막음
    private Coffee() {
        if (INSTANCE != null) throw new RuntimeException("인스턴스가 이미 존재합니다.");
    }
}
