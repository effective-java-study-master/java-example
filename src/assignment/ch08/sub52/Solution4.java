package assignment.ch08.sub52;

import java.util.*;

public class Solution4 {
    static int[][] staticLand;
    static int maxRow;
    static int maxColumn;
    static Map<String, Integer> map = new HashMap<>();

    public static int solution(int[][] land) {
        int answer = 0;
        staticLand = land;
        maxRow = land.length;
        maxColumn = land[0].length;

        if ((1 <= maxRow && maxRow <= 500) && (1<= maxColumn && maxColumn <= 500)) {
            for (int i = 0; i < maxColumn; i++) {
                for (int j = 0; j < maxRow; j++) {
                    if (staticLand[j][i] != 0) {
                        findNearby(i, j);
                    }
                }
                answer = Math.max(answer, map.size());
                map.clear();
            }
        }

        return answer;
    }

    public static void findNearby(int column, int row){
        if (staticLand[row][column] != 0) {
            if(!map.containsKey(row + " " + column)) {
                map.put(row + " " + column, 1);
                if ((column - 1) != -1) findNearby(column - 1, row);
                if ((column + 1) != maxColumn) findNearby(column + 1, row);
                if ((row - 1) != -1) findNearby(column, row - 1);
                if ((row + 1) != maxRow) findNearby(column, row + 1);
            }
        }
    }


    public static void main(String[] args) {
        int[][] land1 = {   {0, 0, 0, 1, 1, 1, 0, 0},
                            {0, 0, 0, 0, 1, 1, 0, 0},
                            {1, 1, 0, 0, 0, 1, 1, 0},
                            {1, 1, 1, 0, 0, 0, 0, 0},
                            {1, 1, 1, 0, 0, 0, 1, 1}};

        int[][] land2 = {   {1, 0, 1, 0, 1, 1},
                            {1, 0, 1, 0, 0, 0},
                            {1, 0, 1, 0, 0, 1},
                            {1, 0, 0, 1, 0, 0},
                            {1, 0, 0, 1, 0, 1},
                            {1, 0, 0, 0, 0, 0},
                            {1, 1, 1, 1, 1, 1}};

        long beforeTime = System.nanoTime();

        int result1 = solution(land1);
        //int result2 = solution(land2);

        long afterTime = System.nanoTime();
        long secDiffTime = (afterTime - beforeTime);

        System.out.println("result1 : " + result1);
        //System.out.println("result2 : " + result2);
        System.out.println("시간차이(ms) : " + secDiffTime);
    }
}