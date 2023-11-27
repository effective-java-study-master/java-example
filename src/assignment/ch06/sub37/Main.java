package assignment.ch06.sub37;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toSet;

class Plant {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }  // 생애주기

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override public String toString() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Plant[] garden = new Plant[3];
        garden[0] = new Plant("test1", Plant.LifeCycle.ANNUAL);
        garden[1] = new Plant("test2", Plant.LifeCycle.PERENNIAL);
        garden[2] = new Plant("test3", Plant.LifeCycle.BIENNIAL);

        Map<Plant.LifeCycle, Set<Plant>> plantsByLifeCycle = new EnumMap<>(Plant.LifeCycle.class);  // EnumMap

        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantsByLifeCycle.put(lc, new HashSet<>());

        for (Plant p : garden)
            plantsByLifeCycle.get(p.lifeCycle).add(p);

        System.out.println(plantsByLifeCycle);

        System.out.println(Arrays.stream(garden).collect(groupingBy(p -> p.lifeCycle, () -> new EnumMap<>(Plant.LifeCycle.class), toSet())));
    }
}
