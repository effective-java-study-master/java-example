package assignment.ch04.sub20;


class Ttt implements ActionComedy {

    @Override
    public void fight() {

    }

    @Override
    public void slapstick() {

    }

    @Override
    public void laugh() {

    }
}
class MainTest20 {

    public static void main(String[] args) {
        Ttt ttt = new Ttt();
        System.out.println(ttt instanceof Action);
        System.out.println(ttt instanceof Comic);
        System.out.println(ttt instanceof ActionComedy);

        Inter2 inter2 = new Inter2();
        System.out.println(inter2 instanceof Inter1);
        System.out.println(inter2 instanceof Inter2);
        System.out.println(inter2 instanceof Inter0);
    }
//        true
//        true
//        true

//        true
//        true
//        true
}