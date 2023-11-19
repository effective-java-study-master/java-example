package assignment.ch06.sub34;

import static assignment.ch06.sub34.PayrollDayWithStrategy.PayType.WEEKDAY;
import static assignment.ch06.sub34.PayrollDayWithStrategy.PayType.WEEKEND;
class MainTest34 {
    public static void main(String[] args) {
//        System.out.println(OperationAbstractWithField.PLUS.apply(1, 2));
//        System.out.println(OperationAbstractWithField.TIMES.apply(2, 6));


        PayrollDayWithStrategy friday = PayrollDayWithStrategy.FRIDAY;
        int pay = friday.pay(540, 1);
        System.out.println(pay);
    }
}