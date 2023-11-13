package assignment.ch05.sub27.generic.inherit;

class Tv {}
public class InheritMain {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("SmartTV");
        product.setCompany("LG");

        Storage<Tv> tvStorage = new StorageImpl<>(10);
        tvStorage.add(new Tv(), 0);
        Tv tv = tvStorage.get(0);
        if (tv != null) {
            System.out.println("tv!");
        }


    }
}
