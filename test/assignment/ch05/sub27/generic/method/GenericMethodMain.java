package assignment.ch05.sub27.generic.method;

public class GenericMethodMain {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");
//        boolean res = Util.compare(p1, p2);
        boolean res = Util.<Integer, String>compare(p1, p2);
        System.out.println(res); // true
    }
}
