package assignment.ch3.sub11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

 class HashCodeTest {

    @DisplayName("해쉬코드를 재정의하지 않아 논리적 동치성이 맞지 않다.")
    @Test
    void notEqualsInHashMapWhenNotDefineMethodHashCode() {
        // given
        String value = "길동";
        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(new PhoneNumber((short) 100,(short)200,(short)300), value);

        // when
        String result = map.get(new PhoneNumber((short) 100, (short) 200, (short) 300));

        // then
        Assertions.assertEquals(value,result);
    }

}
