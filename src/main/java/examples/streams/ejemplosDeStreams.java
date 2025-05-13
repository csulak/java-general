package examples.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Los Streams vs Listas.
 * Streams puede ser lazy, es decir, no ejecuta el filtro hasta que no se le pida el resultado.
 * Por eso es importante el toList() o el collect(Collectors.toList()).
 * Si es que necesitamos el resultado de forma inmediata, Si no se ejecuta cuando se le pide el resultado.
 */
public class ejemplosDeStreams {

    public static void main(String[] args) {

        streamEjemplo();

        printSeparator();

        listEjemplo();

        printSeparator();


    }

    private static void streamEjemplo() {
        System.out.println("antes stream");

        Stream<Integer> lista = Arrays.asList(1,2,3).stream().filter(
                x -> {
                    System.out.println("Visiting " + x);
                    return x > 0;
                }
                );

        System.out.println("despues stream");

        lista.forEach(x -> System.out.println("Imprimiendo " + x));

    }


    private static void listEjemplo() {
        System.out.println("antes lista");

        List<Integer> lista = Arrays.asList(1,2,3).stream().filter(
                x -> {
                    System.out.println("Visiting " + x);
                    return x > 0;
                }
        ).toList(); // gracias a la llamada a toList() se ejecuta el filtro en este momento y "deja" de ser Lazy

        System.out.println("despues lista");


        lista.forEach(x -> System.out.println("Imprimiendo " + x));
    }


    public static void printSeparator() {
        System.out.println("\n-----------------------------------------------------------\n");
    }
}
