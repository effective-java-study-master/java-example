package assignment.ch07.sub42;

import java.util.function.DoubleBinaryOperator;

public class Main {
    public enum Operation {
        PLUS("+", (x, y) ->  x + y
//                {
//                    System.out.println(symbol);
//                    return x + y;
//                }
        ),
        MINUS("-", (x, y) -> x - y);

        private final String symbol;
        private final DoubleBinaryOperator op; // java.util.function 패키지가 제공하는 함수 인터페이스

        Operation(String symbol, DoubleBinaryOperator op) {
            this.symbol = symbol;
            this.op = op;
        }

        public double apply(double x, double y) {
            return op.applyAsDouble(x, y);
        }
    }

    public static void main(String[] args){
        Operation.PLUS.apply(2, 3);
    }
}
