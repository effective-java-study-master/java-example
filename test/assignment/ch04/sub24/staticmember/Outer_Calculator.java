package assignment.ch04.sub24.staticmember;

public class Outer_Calculator {

    public static enum Inner_Operator_Enum {
        PLUS, MINUS
    }

    int add(Inner_Operator_Enum operatorEnum, int x, int y) {
        System.out.println(operatorEnum.name());
        return x + y;
    }
}
