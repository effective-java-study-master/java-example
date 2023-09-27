package assignment.ch02.sub03;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static assignment.ch02.sub03.Printer.Option.PRINT;

class Item3 {
    @DisplayName("정적 팩토리 메서드 방식으로 인스턴스를 만들고 싱글턴임을 보장해라. 단, 조건으로 리플렉션 API 의 대한 예외처리를 명시해야 한다.")
    @Test
    void item3_answer() {
        try {
            /* 조잡한 코드입니다.... */
            Printer printer = Printer.getInstance();
            printer.setSelectOption(PRINT);
            printer.setText("printer: 프린트 하자1");
            printer.execute();

            reflectionTest(printer);

            printer.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    void reflectionTest(Printer printer) {
        Class<Printer> printerClass = Printer.class;
        Arrays.stream(printerClass.getDeclaredConstructors()).forEach(f -> {
            try {
                f.setAccessible(true);
                Printer reflectionPrinter = (Printer) f.newInstance();
                reflectionPrinter.setSelectOption(PRINT);
                reflectionPrinter.setText("reflectionPrinter: 프린트 하자2");
                reflectionPrinter.execute();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}