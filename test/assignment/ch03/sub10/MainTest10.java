package assignment.ch03.sub10;


class Value {
    int value;
    Value(int value) {
        this.value = value;
    }
}
class MainTest10 {


    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        System.out.println(v1);
        System.out.println(v2);
        // assignment.ch03.sub10.Value@5594a1b5
        // assignment.ch03.sub10.Value@6a5fc7f7
        
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
        // 1435804085
        // 1784662007

        // primitive 던, reference 던 주소값을 비교하는 것
        // primitive type에 대해서는 값을 비교한다. reference type에 대해서는 주소값을 비교한다.
        // 사실 primitive type도 Constant Pool에 있는 특정 상수를 참조하는 것이기 때문에
        // 결국 주소값을 비교하는 것으로 볼 수 있다.
        System.out.println(v1 == v2);
        System.out.println(v1.equals(v2)); // 객체의 주소 비교 (참조변수 값 비교)
        // false
        // false
    }
}