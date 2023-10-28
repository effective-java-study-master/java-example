package assignment.ch3.sub13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CloneTest {

    @DisplayName("cloneable 을 상속받아 clone을 재정의하면 객체를 복사할 수 있다.")
    @Test
    void overridingCloneable() throws CloneNotSupportedException {
        // given
        Cafe cafe = new Cafe("아메리카노",1000);

        // when
        Cafe clone = cafe.clone();

        // then
        assertAll(
                () -> assertEquals(cafe.getName(),clone.getName()),
                () -> assertEquals(cafe.getPrice(),clone.getPrice())
        );
    }

    @DisplayName("복사 생성자를 이용하여 객체룰 복사한다.")
    @Test
    void CopyObjectUseCopyConstructor() {
        // given
        Cafe cafe = new Cafe("라떼", 5000);

        // when
        Cafe copy = new Cafe(cafe);

        // then
        assertAll(
                () -> assertEquals(cafe.getName(),copy.getName()),
                () -> assertEquals(cafe.getPrice(),copy.getPrice()),
                () -> assertNotSame(cafe.getPrice(),copy.getPrice())
        );
    }

    @DisplayName("복사 팩터리 이용하여 객체룰 복사한다.")
    @Test
    void CopyObjectUseCopyFactory() {
        // given
        Cafe cafe = new Cafe("라떼", 5000);

        // when
        Cafe copy = Cafe.newInstance(cafe);

        // then
        assertAll(
                () -> assertEquals(cafe.getName(),copy.getName()),
                () -> assertEquals(cafe.getPrice(),copy.getPrice()),
                () -> assertNotSame(cafe.getPrice(),copy.getPrice())
        );
    }


}
