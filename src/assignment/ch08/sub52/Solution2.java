package assignment.ch08.sub52;

import java.util.Random;

public class Solution2 {
    public static int solution(int num) {
        int answer = 0;

        if (1 <= num && num <= 50000000) {
            int frontNum = 0;
            int backNum = 0;
            int temp_num = num;

            while (true) {
                if(!checkEvenDigits(temp_num)){
                    temp_num++;
                    continue;
                }

                int length = (int)( Math.log10(temp_num)+1 );
                frontNum = digitCalculation(temp_num, length,true);
                backNum = digitCalculation(temp_num, length,false);

                if (frontNum == backNum) break;
                temp_num++;
            }

            answer = temp_num;
        }

        return answer;
    }

    private static boolean checkEvenDigits(int num) {
        int digitCount = 0;

        // 숫자의 자릿수를 세는 반복문
        while (num != 0) {
            num /= 10;
            digitCount++;
        }

        // 자릿수가 짝수인지 여부를 반환
        return digitCount % 2 == 0;
    }

    public static int digitCalculation(int num, int length, boolean type) {
        int returnNum = 0;
        for (int i = 0; i < (length / 2); i++){
            String strNum = Integer.toString(num);

            int temp_num = 0;
            if(type)
                temp_num = strNum.charAt(i) - '0';
            else
                temp_num = strNum.charAt(i + (length / 2)) - '0';

            if(temp_num == 0) return 0;
            if(returnNum != 0) returnNum = returnNum * temp_num;
            else returnNum = temp_num;
        }
        return returnNum;
    }

    public static void main(String[] args) {
        int result1 = solution(21);
        int result2 = solution(999);
        int result3 = solution(23578386);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}