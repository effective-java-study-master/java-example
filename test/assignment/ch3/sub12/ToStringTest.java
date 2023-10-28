package assignment.ch3.sub12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ToStringTest {

    @DisplayName("toString을 재정의하지 않으면 단순히 클래스 이름을 반환한다.")
    @Test
    void NotOverridingIsReturnObjectClassName() {

        String details = "{서울, 여수, 60000}";
        // given
        Travel travel = new Travel("서울","여수",60000);

        // when
        String result = travel.toString();

        // then
        Assertions.assertEquals(details,result);
    }
}
