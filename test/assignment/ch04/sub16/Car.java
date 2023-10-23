package assignment.ch04.sub16;

public class Car {

    private final String name;

    public int position;
    // private int position;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
