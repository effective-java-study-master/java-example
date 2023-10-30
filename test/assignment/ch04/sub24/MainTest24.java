package assignment.ch04.sub24;


import assignment.ch04.sub24.nonstaticmember.Outer_Sample;
import assignment.ch04.sub24.staticmember.Outer_Calculator;

class MainTest24 {

    public MainTest24() {
    }

    public static void main(String[] args) {
        SttcMember.SttcInnerClss sttcInnerClss = new SttcMember.SttcInnerClss();
        System.out.println(sttcInnerClss.attr);
        // what

        System.out.println(Outer_Calculator.Inner_Operator_Enum.PLUS);
        // PLUS



        Outer_Sample outerSample = new Outer_Sample();
        // outer

        Outer_Sample.Inner_Sample_Non_Static innerSampleNonStatic = outerSample.new Inner_Sample_Non_Static();
        innerSampleNonStatic.innerMethodCallOuterMethod();
        // inner
        // do AAAAA!
        // do inner BBBBB~~~

    }
}