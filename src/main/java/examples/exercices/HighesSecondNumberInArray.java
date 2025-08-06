package examples.exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HighesSecondNumberInArray {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(6);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(6);

        Map<Integer, Integer> numbersCount = new HashMap<>();

        for (int number : numbers)
        {
            numbersCount.put(number, numbersCount.getOrDefault(number, 0) + 1);
        }

        // Set<Map.Entry<Integer, Integer>> entrySet =
        var ads = numbersCount.entrySet()
                .stream()
                .sorted((a,b) -> b.getValue() - a.getValue())
                .skip(1)
                .findFirst()
                .orElse(null);
                //.forEach(entry -> System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue()));

        System.out.println("asd: " + ads);

    }
}
