package assignment.ch06.sub37;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class MainTest37_2 {

    public static void main(String[] args) {
        // getNode(), get() debug
//        HashMap<String, Integer> sampleMap = new HashMap<>();
//        sampleMap.put("1", 1);
//        sampleMap.put("3", 3);
//
//        System.out.println(sampleMap.get("3"));


        // ordinal() 활용해보기
        List<Lotto> lotteries = new ArrayList<>();
        lotteries.add(new Lotto(Rank.FIRST));
        lotteries.add(new Lotto(Rank.SECOND));
        lotteries.add(new Lotto(Rank.THIRD));

        useOrdinal(lotteries);
    }


    public static void useOrdinal(List<Lotto> lotteries) {
        Set<Lotto>[] lotteriesByRank = (Set<Lotto>[]) new Set[Rank.values().length];

        for (int i = 0; i < lotteriesByRank.length; i++) {
            lotteriesByRank[i] = new HashSet<>();
        }

        for (Lotto each : lotteries) {
            lotteriesByRank[each.getRank().ordinal()].add(each);
        }

        for (int i = 0; i < lotteriesByRank.length; i++) {
            System.out.printf("%s: %s%n", Rank.values()[i], lotteriesByRank[i]);
        }

        // 출력 결과
        // MISS: []
        // FIFTH: []
        // FOURTH: []
        // THIRD: [Lotto{rank=THIRD}]
        // SECOND: [Lotto{rank=SECOND}]
        // FIRST: [Lotto{rank=FIRST}]
    }
}