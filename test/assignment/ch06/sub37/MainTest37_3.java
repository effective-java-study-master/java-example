package assignment.ch06.sub37;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

class MainTest37_3 {

    public static void main(String[] args) {
        LocalTime start = LocalTime.now();

        Map<Rank, String> lottoMap = generateEnumMap();

        lottoMap.put(Rank.FIRST, "1등");
        lottoMap.put(Rank.SECOND, "2등");
        lottoMap.put(Rank.THIRD, "3등");
        lottoMap.put(Rank.FOURTH, "4등");
        lottoMap.put(Rank.FIFTH, "5등");

        System.out.println(lottoMap);
        LocalTime end = LocalTime.now();
        Duration between = Duration.between(end, start);
        System.out.println(between); //PT-0.0009967S
        // {FIFTH=5등, FOURTH=4등, THIRD=3등, SECOND=2등, FIRST=1등}
        //PT-0.0013292S

//        Map<Rank, String> lottoMap = generateHashMap();
//
//        lottoMap.put(Rank.FIRST, "1등");
//        lottoMap.put(Rank.SECOND, "2등");
//        lottoMap.put(Rank.THIRD, "3등");
//        lottoMap.put(Rank.FOURTH, "4등");
//        lottoMap.put(Rank.FIFTH, "5등");
//
//        System.out.println(lottoMap);
//        LocalTime end = LocalTime.now();
//        Duration between = Duration.between(end, start);
//        System.out.println(between); //PT-0.0009967S
        // {FIFTH=5등, FOURTH=4등, SECOND=2등, THIRD=3등, FIRST=1등}
    }

    public static Map<Rank, String> generateEnumMap() {
        return new EnumMap<>(Rank.class);
    }


    public static Map<Rank, String>  generateHashMap() {
        return new HashMap<>();
    }
}