package assignment.ch04.sub15;

import static assignment.ch04.sub15.MainTest.VALUES;

public class CallTest {
    public static final Ttt ttt = new Ttt();
    MainTest mainTest = new MainTest();

    public static void getMainTest() {
        Integer[] values = VALUES;
        values[0] = 4;
        for (int i = 0; i < values.length; i++) {
            Integer value = values[i];
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        getMainTest();
        ttt.testString = "world";
        System.out.println(ttt.testString);
    }
}
