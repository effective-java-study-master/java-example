package assignment.ch04.sub24.nonstaticmember;

public class Outer_Sample {

    void doSomething() {
        System.out.println("do AAAAA!");
    }

    public Outer_Sample() {
        System.out.println("outer");
    }

    // 비정적 멤버 클래스
    public class Inner_Sample_Non_Static {
        public Inner_Sample_Non_Static() {
            System.out.println("inner");
        }

        private String name;

        public void innerMethodCallOuterMethod() {
            Outer_Sample.this.doSomething();
            System.out.println("do inner BBBBB~~~");
        }
    }
}
