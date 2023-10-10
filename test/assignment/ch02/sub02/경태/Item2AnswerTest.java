package assignment.ch02.sub02.경태;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static assignment.ch02.sub02.경태.BeefBurger.Size.LARGE;
import static assignment.ch02.sub02.경태.Hamburger.Topping.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Item2AnswerTest {

    @DisplayName("빌더 패턴을 이용하여 공변 반환 타이핑의 예")
    @Test
    void item2_answer() {
        // given
        BeefBurger beefBurger = new BeefBurger.Builder(LARGE)
                .addTopping(BEEF)
                .addTopping(ONION)
                .addTopping(MUSHROOM)
                .build();

        ChickenBurger chickenBurger = new ChickenBurger.Builder()
                .addTopping(CHICKEN)
                .addTopping(ONION)
                .addExtraSauce()
                .build();

        ChickenBurger chickenBurger2 = new ChickenBurger.Builder()
                .addTopping(CHICKEN)
                .addTopping(ONION)
                .build();

        // when // then
        assertTrue(beefBurger.getToppings().contains(BEEF));
        assertTrue(chickenBurger.isExtraSauce());
        assertFalse(chickenBurger2.isExtraSauce());


    }


}
