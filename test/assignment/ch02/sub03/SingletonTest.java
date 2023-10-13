package assignment.ch02.sub03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @DisplayName("정적 팩토리 메서드 패턴을 이용하여 싱글턴 인슨턴스를 보장하라.")
    @Test
    void SingletonTest() {
        // given
        Coffee coffee1 = Coffee.INSTANCE;

        // when
        Coffee coffee2 = Coffee.INSTANCE;

        // then
        assertEquals(coffee1,coffee2);
        assertSame(coffee1,coffee2);
    }

    @DisplayName("리플랙션을 통한 인스턴스 생성을 막는 경우")
    @Test
    void ProtectReflectionGetInstance() throws ClassNotFoundException, NoSuchMethodException {
        // given
        Class coffeeClass = Class.forName("assignment.ch02.sub03.Coffee");

        Constructor coffeeConstructor = coffeeClass.getDeclaredConstructor();
        coffeeConstructor.setAccessible(true);

        // when  // then
        assertThrows(InvocationTargetException.class, () -> {
            Coffee coffee2 = (Coffee) coffeeConstructor.newInstance();
                }, "인스턴스가 이미 존재합니다."
        );

    }
}
