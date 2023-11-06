package assignment.ch04.sub24;

/**
 * ITEM 24
 *      Q.  아래의 코드의 바깥 클래스 Pokemon과 비정적 맴버 클래스 Pikachu를 활용하여 다음 조건을 만족시켜주세요.
            [조건] 비정적 맴버 클래스 Pikachu의 인스턴스를 생성하고 shock() 메서드를 호출할 것
            main 함수의 1), 2), 3) 에 순서대로 작성할 것
 * */
public class Pokemon {
    private String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("I am " + name + " 💫⚡️");
    }

    // 비정적 멤버 클래스 Pikachu
    public class Pikachu {
        public void shock() {
            System.out.println("Pikachu is using Thunderbolt!");

            // 바깥 Pokemon 클래스의 메서드 호출
            introduce();

            // 바깥 Pokemon 클래스의 참조 가져오기
            Pokemon.this.introduce();
        }
    }

    public static void main(String[] args) {

        // 1) 바깥 클래스 인스턴스 생성

        // 2) Pikachu 인스턴스 생성

        // 3) Pikachu로 바깥 클래스 Pokemon의 메서드 호출

    }
}
