package assignment.ch04.sub17.수예.문제;

import java.util.Date;

/**
 * Q) 아래의 Person 클래스가 불변 클래스를 보장받을 수 있도록 코드를 수정해주세요.
 *     [조건]
 *     1. 클래스를 확장할 수 없도록 할 것
 *     2. 모든 필드를 final로 선언할 것
 *     3. 모든 필드를 private으로 선언할 것
 *     4. 객체의 상태를 변경하는 메서드(변경자)를 제공하지 않을 것
 * */
public class Person {

    public String name;
    public Date birthDate;

    public Person(String name, Date birthDate) {
        this.name = name;
        this.birthDate = new Date(birthDate.getTime());
    }

    public String setName(String name){
        return this.name = name;
    }

    public Date setBirthDate(Date birthDate){
        return this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime());
    }

    public static void main(String[] args) {
        Person person = new Person("suye", new Date(2023, 10, 24));
    }
}


