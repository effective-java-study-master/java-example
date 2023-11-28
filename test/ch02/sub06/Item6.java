package ch02.sub06;

import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;

public class Item6 {

    // before : 기존 코드
    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    // after : 메서드에서 정적 메서드를 이용하여 생성된 객체를 재활용하도록 수정
    static class RomanNumerals {
        private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

        static boolean isRomanNumeral(String s) {
            return ROMAN.matcher(s).matches();
        }
    }

    @Test
    public void regexTest() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            boolean iiv = isRomanNumeral("IV");
        }

        long end = System.currentTimeMillis();

        System.out.println("매번 새로 생성 : " + (end - start) + "ms");
    }
    /**
     *
        String.matches() 메서드의 구현을 따라가보면, 위처럼 Pattern 인스턴스를 생성하는 부분이 있다.
        위 과정에서 생성되는 Pattern 인스턴스는 한번 쓰고 버려져 가비지컬렉션된다.
        정규표현식에 해당되는 유한상태머신을 만들기 때문에 인스턴스 생성 비용이 높다.
        내부적으로 Pattern을 생성하는 로직을 밖으로 빼서 재활용하면 객체 생성을 1번만 하고 성능을 높일 수 있다.
     */
    @Test
    public void regexTest2() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            boolean iiv = RomanNumerals.isRomanNumeral("IV");
        }

        long end = System.currentTimeMillis();

        System.out.println("객체 재활용 : " + (end - start) + "ms");
    }
}
