package examples.sortingAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort
{
    public static void main(String[] args)
    {
        // Aprendiendo el Algoritmo de ordenamiento por insercion

        List<Integer> numerosDesordenados = new ArrayList<>();
        numerosDesordenados.add(24);
        numerosDesordenados.add(15);
        numerosDesordenados.add(9);
        numerosDesordenados.add(80);
        numerosDesordenados.add(44);
        System.out.println("Lista desordenada: " + numerosDesordenados);

        for (int j = 1; j < numerosDesordenados.size(); j++)
        {
            int numeroAComparar = numerosDesordenados.get(j);

            int i = j - 1;
            while (i >= 0 && numerosDesordenados.get(i) > numeroAComparar)
            {
                numerosDesordenados.set(i+1, numerosDesordenados.get(i));
                i = i - 1;
            }
            numerosDesordenados.set(i+1, numeroAComparar);

            //convertir string to char

        }

        // ejem`ll

        System.out.println("Lista ordenada: " + numerosDesordenados);






    }
}
