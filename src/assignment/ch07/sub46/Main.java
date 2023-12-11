package assignment.ch07.sub46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("stop");
        words.add("spot");
        words.add("trim");
        words.add("meet");
        words.add("ball");
        words.add("free");
        words.add("trim");
        words.add("meet");

        Map<String, Long> freq = words.stream()
                .collect(groupingBy(String::toLowerCase, counting()));

        List<String> topTwo = freq.keySet()
                .stream()
                .sorted(comparing(freq::get).reversed())
                .limit(2)
                .collect(toList());

        System.out.println("words = " + words);
        System.out.println("freq = " + freq);
    }
}
