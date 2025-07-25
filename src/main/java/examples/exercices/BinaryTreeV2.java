package examples.exercices;

import java.util.*;

public class BinaryTreeV2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(500, 3, 7, 2, 4, 6, 8, null, 10);
        numbers = new ArrayList<>(numbers);
        numbers.removeIf(Objects::isNull);

        Map<Integer, List<Integer>> arbolBinarioMap = new HashMap<>();
        for (int i = 0; i < numbers.size(); i++) {
            int level = (int) Math.floor(Math.log(i + 1) / Math.log(2));
            arbolBinarioMap.computeIfAbsent(level, k -> new ArrayList<>()).add(numbers.get(i));
        }
        System.out.println(arbolBinarioMap);

        Map<Integer, Integer> sumOfLevels = new HashMap<>();
        for (var entry : arbolBinarioMap.entrySet()) {
            int sum = entry.getValue().stream().mapToInt(Integer::intValue).sum();
            sumOfLevels.put(entry.getKey(), sum);
        }
        System.out.println(sumOfLevels);

        System.out.println(orderSumsDescending(sumOfLevels));
    }


    // Order the sums of the levels in descending order
    public static Map<Integer, Integer> orderSumsDescending(Map<Integer, Integer> sumOfLevels)
    {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(sumOfLevels.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        Map<Integer, Integer> orderedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list)
        {
            orderedMap.put(entry.getKey(), entry.getValue());
        }
        return orderedMap;
    }
}