package assignment.ch08.sub52;

public class Solution3 {
    public static int solution(int n) {
        int res = -1;

        int nCount = Integer.bitCount(n);
        int rCount = 0;

        int startPoint = (int) Math.pow(2, nCount);

        if(isPowerOfTwo(n)){
            res = findExponentOfTwo(n);
        }else {
            for (int i = startPoint - 1; i < n; i++) {
                if (nCount == Integer.bitCount((i)))
                    rCount++;
            }
            res = rCount;
        }

        return res;
    }

    private static boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    private static int findExponentOfTwo(int n) {
        int exponent = 0;
        int currentResult = 1;

        while (currentResult < n) {
            currentResult *= 2;
            exponent++;
        }

        if (currentResult == n) {
            return exponent;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        long beforeTime = System.currentTimeMillis();

        int result1 = solution(1073741823);

        long afterTime = System.currentTimeMillis();
        long secDiffTime = (afterTime - beforeTime);
        System.out.println("result1 : " + result1);
        System.out.println("시간차이(ms) : " + secDiffTime);
    }
}