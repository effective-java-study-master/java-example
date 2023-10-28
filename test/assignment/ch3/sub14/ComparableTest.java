package assignment.ch3.sub14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

public class ComparableTest {

    @DisplayName("compareTo 결과와 equals 결과는 같아야 한다.")
    @Test
    void test() {
        // given
        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("1.00");

        Set<BigDecimal> hs = new HashSet<>();
        hs.add(a);
        hs.add(b);

        // when
        Set<BigDecimal> ts = new TreeSet<>();
        ts.add(a);
        ts.add(b);

        // then
        assertEquals(hs.size(),ts.size());
    }
}
