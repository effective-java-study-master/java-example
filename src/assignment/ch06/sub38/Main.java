package assignment.ch06.sub38;

import java.util.Arrays;
import java.util.Collection;


public class Main {

    public interface Operation {
        double apply(double x, double y);
    }

    public enum ExtendedOperation implements Operation{

        // 확장 연산을 구현한 열거 타입
        EXP("^"){
            @Override
            public double apply(double x, double y) {
                return Math.pow(x, y);
            }
        },

        REMAINDER("%"){
            @Override
            public double apply(double x, double y) {
                return x % y;
            }
        };
        private String symbol;
        ExtendedOperation(String symbol) {
            this.symbol = symbol;
        }

        @Override
        public String toString() {
            return symbol;
        }
    }

    public static void main(String[] args) {
        double x = 0.2;
        double y = 0.3;
        testCollections(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static void testCollections(Collection<? extends ExtendedOperation> asList, double x, double y) {
        for (ExtendedOperation exp : asList) {
            System.out.printf("%f %s %f = %f%n",
                    x, exp, y, exp.apply(x, y));
        }
    }
}
