package assignment.ch3.sub11;

// final을 클래스에 붙여주면 상속 불가함
public final class PhoneNumber implements Cloneable, Comparable<PhoneNumber> {

    private final short areaCode, prefix, lineNum;

    public PhoneNumber(short areaCode, short prefix, short lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "지역코드");
        this.prefix = rangeCheck(prefix, 999, "프리픽스");
        this.lineNum = rangeCheck(lineNum, 9999, "가입자번호");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max) {
            throw new IllegalArgumentException(arg + " : " + val);
        }
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber)) {
            return false;
        }

        PhoneNumber pn = (PhoneNumber) o;
        return pn.lineNum == lineNum && pn.prefix == prefix && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode(){
        // int 변수 result 초기화 후 해당 필드의 해시코드 계산
        // 기본타입 필드라면 Type.hashCode() 여기서는 Short.hashCode();
        int result = Short.hashCode(areaCode);
        // 앞에서 계산한 해시코드로 result 갱신
        // 여기서 31은 홀수이면서 소수이기 때문에 사용
        // 짝수는 2를 곱하면 시프트 연산과 같은 결과를 발생시켜 오버플로가 발생하면 정보를 잃게 됨.
        result = 31 * result + Short.hashCode(prefix);
        result = 31 * result + Short.hashCode(lineNum);
        // result 반환
        return result;
    }

    @Override
    public PhoneNumber clone(){
        try{
            // 형변환
            return (PhoneNumber) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }


    @Override
    public int compareTo(PhoneNumber pn) {
        int result = Short.compare(areaCode, pn.areaCode);
        if(result == 0){
            result = Short.compare(prefix, pn.prefix);
            if(result == 0){
                result = Short.compare(lineNum, pn.lineNum);
            }
        }
        return result;
    }
}
