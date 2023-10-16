package ch02.sub09;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Item9 {

/*
        Q: 아래 코드를 try-with-resources를 이용하여 변경해주세요.
        단, catch문을 사용하여 FileNotFoundException을 잡아야 합니다.
*/
@Test
public static void main(String[] args) throws IOException {

        Scanner scanner = null;
        try {
            // scanner 생성

            scanner = new Scanner(new File("/Users/nahyeon/practice/test1.txt"));

            System.out.println(scanner.nextLine());

        } catch (FileNotFoundException e) {
            // scanner 리소스 반납
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
