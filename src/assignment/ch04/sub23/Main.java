package assignment.ch04.sub23;

import assignment.ch04.sub23.현우.Question;

public class Main {
    public static void main(String[] args) {
        Question kb = new Question("김땡떙", 4);
        Question hana = new Question("이땡땡", "베이징");

        System.out.println(kb.status());
        System.out.println(hana.status());
    }
}
