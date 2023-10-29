package assignment.ch04.sub22;

interface MainTestInterface22 { }

class MainTestAnotherTop22 {}

class MainTest22 {
    public MainTest22() throws ClassNotFoundException {
        System.out.println("hello");
        Class<assignment.ch04.sub22.MainTestInterface22> mainTestInterface22Class = assignment.ch04.sub22.MainTestInterface22.class;
        System.out.println(mainTestInterface22Class.getTypeName());
        Class<?> aClass = Class.forName(mainTestInterface22Class.getTypeName());
        System.out.println(aClass.getName());

    }

    public static void main(String[] args) throws ClassNotFoundException {
        assignment.ch04.sub22.MainTest22 mainTest22 = new assignment.ch04.sub22.MainTest22();
    }
}