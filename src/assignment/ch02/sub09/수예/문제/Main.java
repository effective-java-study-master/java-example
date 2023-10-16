package assignment.ch02.sub09.수예.문제;

import java.io.*;
import java.util.Scanner;


/*
        Q: 아래 코드를 try-with-resources를 이용하여 변경해주세요.
        단, catch문을 사용하여 FileNotFoundException을 잡아야 합니다.
*/
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = null;
        try {
            // scanner 생성
            scanner = new Scanner(new File("/Users/suyeah/practice/test1.txt"));
            System.out.println(scanner.nextLine());
        } finally {
            // scanner 리소스 반납
            if (scanner != null) {
                scanner.close();
            }
        }
    }

}
