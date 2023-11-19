package assignment.ch05.sub26;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ITEM 26
 * Q: 아래의 RawType 클래스는 실행시 ClassCastException을 발생시킵니다.
 *    해당 런타임 오류가 발생하지 않도록 코드를 수정하고,
 *    수정한 코드가 기존의 raw type과 비교하여 어떻게 달라지는지 주석에 적어주세요.
 *    [조건] 코드 작성시 타입 이외의 구문은 수정하지 않을 것!
 * */

public class RawTypeTest {

    static class Galaxy {
        public void cancel(){
            System.out.println("Galaxy.cancel");
        }
    }

    static class Iphone {
        public void cancel(){
            System.out.println("Iphone.cancel");
        }
    }

    public static void main(String[] args) {
        // Iphones는 Iphone 인스턴스만 취급
        Collection<Iphone> iphones = new ArrayList();

        // 💡여기에 주석을 적어주세요!
        iphones.add(new Iphone());
//        iphones.add(new Galaxy());

        for (Iterator i = iphones.iterator(); i.hasNext();) {
            Iphone iphone = (Iphone) i.next();
            iphone.cancel();
        }
    }
}