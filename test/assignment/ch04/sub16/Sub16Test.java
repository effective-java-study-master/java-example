package assignment.ch04.sub16;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sub16Test {

    public Sub16Test() {
        MainTest16 mainTest16 = new MainTest16();
        mainTest16.attrStr = "changed";

        System.out.println("너무나 당연: " + mainTest16.attrStr);

    }

    public static void main(String[] args) {
        Sub16Test sub16Test = new Sub16Test();
        Time time = new Time(1,2);
        // time.minute = 33; // 불변식 보장
        System.out.println(time.hour + ":" + time.minute);

        List<Car> carList = new ArrayList<>(Arrays.asList(new Car("car1", 1), new Car("car2", 2)));
        Cars cars = new Cars(carList);
        System.out.println("====처음 상태====");
        System.out.println(cars);
        System.out.println();

        System.out.println("====초기 주입한 carList 내의 요소의 상태 변경====");
        carList.get(0).position = 10000;
        System.out.println(cars);

        BigInteger bigInteger = BigInteger.valueOf(1);
        BigInteger negate = bigInteger.negate();
        System.out.println(bigInteger);
        System.out.println(negate);
    }
    // 너무나 당연: changed
    //====처음 상태====
    // Cars{cars=[Car{name='car1', position=1}, Car{name='car2', position=2}]}
    //
    //====초기 주입한 carList 내의 요소의 상태 변경====
    // Cars{cars=[Car{name='car1', position=10000}, Car{name='car2', position=2}]}
    // bigInteger.mag.toString(): [I@5afa04c
    // negate.mag.toString(): [I@5afa04c
}