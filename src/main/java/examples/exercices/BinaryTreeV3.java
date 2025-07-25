package examples.exercices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class BinaryTreeV3
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5); // level 0
        numbers.add(3); // level 1
        numbers.add(7); // level 1
        numbers.add(2); // level 2
        numbers.add(4); // level 2
        numbers.add(6); // level 2
        numbers.add(8); // level 2
        numbers.add(null); // level 3
        numbers.add(10); // level 3

        // clear null values
        numbers.removeIf(Objects::isNull);


        // Logaritmo en base 2 de la cantidad de elementos
        var height = Math.log(numbers.size()) / Math.log(2);


        // obtener la parte entera del logaritmo
        int entero =(int) Math.floor(height);

        System.out.println(height);
        System.out.println(entero);


        // organizar en un map el arbol binario
        // con la clave como el nivel del arbol y el valor como una lista de los nodos en ese nivel
        Map<Integer, List<Integer>> arbolBinarioMap = new HashMap<>();

        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println("index: "+ i + " value: " + numbers.get(i));
            var level = Math.log(i+1) / Math.log(2);
            var levelEntero =(int) Math.floor(level);
            //arbolBinarioMap.put(levelEntero, new ArrayList<>());
            arbolBinarioMap.computeIfAbsent(levelEntero, v -> new ArrayList<>()).add(numbers.get(i));
        }

        System.out.println(arbolBinarioMap);

        // Sumar los nodos de cada nivel
        Map<Integer, Integer> sumOfLevels = new HashMap<>();

        //for (Map<Integer, List<Integer>> entry : arbolBinarioMap)
        for (Map.Entry<Integer, List<Integer>> entry : arbolBinarioMap.entrySet())
        {
            System.out.println("Entry: " + entry);
            int level = entry.getKey();
            List<Integer> nodes = entry.getValue();
            int sum = 0;
            for (Integer node : nodes)
            {
                sum += node;
            }
            sumOfLevels.put(level, sum);
        }
        System.out.println(sumOfLevels);
    }
}
