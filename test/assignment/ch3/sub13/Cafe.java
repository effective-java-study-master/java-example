package assignment.ch3.sub13;

public class Cafe implements Cloneable {
    private String name;
    private int price;


    public Cafe(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
    //복사 생성자 예
    public Cafe(Cafe cafe){
        this.name = cafe.name;
        this.price = cafe.price;
    }
    //복사 팩터리 예
    public static Cafe newInstance(Cafe cafe){
        return new Cafe(cafe.name, cafe.price);
    }

    @Override
    public Cafe clone() {
        try {
            return (Cafe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }

    }
}
