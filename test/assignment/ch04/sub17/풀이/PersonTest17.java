package assignment.ch04.sub17.풀이;


import java.util.Date;

final class PersonTest17 {

    private final String name;
    private final Date brithDate;


    PersonTest17(String name, Date brithDate) {
        this.name = name;
        this.brithDate = brithDate;
    }

    public String getName() {
        return name;
    }

    public Date getBrithDate() {
        return brithDate;
    }

    public static void main(String[] args) {
        PersonTest17 person = new PersonTest17("suye", new Date(2023, 10, 24));
    }
}