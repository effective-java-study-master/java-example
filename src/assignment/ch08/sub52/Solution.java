package assignment.ch08.sub52;

import java.util.Arrays;
import java.util.Random;

public class Solution {
    public static int solution(int n, int[] v) {
        int answer = -1;
        if(2 <= n && n <= 1000000) {
            int sell = -1; //팔다
            int buy = -999999999; //사다

            for (int i = 0; i < v.length; i++) {
                if(1 <= v[i] && v[i] <= 1000000000) {
                    if(i != 0) {
                        buy = Math.max(buy, sell - v[i]);
                    }
                    if(!(v.length == (i+1))) {
                        sell = Math.max(sell, v[i]);
                    }
                }else{
                    break;
                }
            }

            return buy;
        }
        return answer;
    }

    public static int[] example() {
        Random random = new Random(); //랜덤 객체 생성(디폴트 시드값 : 현재시간)
        random.setSeed(System.currentTimeMillis()); //시드값 설정을 따로 할수도 있음
        int randomFix = random.nextInt(1000000);

        int[] result = new int[randomFix];
        for(int i=0; i < result.length; i++){
            result[i] = random.nextInt(1000000000)+1;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] v1 = example();
        int[] v2 = example();

        long beforeTime = System.nanoTime();
        int result1 = solution(v1.length, v1);
        int result2 = solution(v2.length, v2);
        long afterTime = System.nanoTime();
        long secDiffTime = (afterTime - beforeTime);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("시간차이(m) : "+secDiffTime);
    }
}
