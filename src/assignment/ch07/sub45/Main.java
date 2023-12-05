package assignment.ch07.sub45;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

class Main {
    public static void main(String[] args) {

        List<String> fruitNames = Arrays.asList("apple", "orange", "banana", "grape", "apricot", "kiwi");

        // 스트림 파이프라인
        List<String> result = fruitNames.stream().filter(e -> e.charAt(0) == 'a').collect(toList());
        // 중간연산: "a"로 시작하는 원소 찾기
        // 종단연산: 리스트로 모으기

        // 결과 출력
        result.forEach(System.out::println);
    }
}