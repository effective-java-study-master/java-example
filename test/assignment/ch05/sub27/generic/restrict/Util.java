package assignment.ch05.sub27.generic.restrict;

public class Util {
    // 제한된 타입 파라미터
    public static <T extends Number> int compare(T t1, T t2) {
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2);
    }

    public static void main(String[] args) {
        int res1 = compare(10, 20);
        System.out.println(res1); // -1

        int res2 = compare(4.2, 4);
        System.out.println(res2);// 1
    }
}
