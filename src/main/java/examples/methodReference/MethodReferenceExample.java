package examples.methodReference;

import java.io.PrintStream;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * En estos ejemplos se juega con los metodos de referencia y las funciones lambda.
 * Para cada ejemplo se hace de las 2 formas como para ver como seria en cada caso
 *
 * Function: Es una interfaz funcional que representa una función que toma un argumento y devuelve un resultado.
 * Function<T, R>: T es el tipo de entrada y R es el tipo de salida.
 *
 * Supplier: Es una interfaz funcional que representa un proveedor de resultados. No toma argumentos y devuelve un resultado.
 * Supplier<T>: T es el tipo de resultado.
 *
 * Predicate: Es una interfaz funcional que representa una función que toma un argumento y devuelve un valor booleano.
 * Predicate<T>: T es el tipo de entrada.
 *
 *
 *
 */
public class MethodReferenceExample {

    public static void main(String[] args) {

        PrintStream asd = System.out;

        asd.println("Hello Maru!");


        // Metodos estaticos
        Function<String, Integer> numberOfCharactersA = (String s) -> s.length();
        Function<String, Integer> numberOfCharactersB = String::length;

        System.out.println("Number of characters in 'Hello' using lambda: " + numberOfCharactersA.apply("Hello"));
        System.out.println("Number of characters in 'Hello' using method reference: " + numberOfCharactersB.apply("Hello"));

        printSeparator();

        // Constructores
        Supplier<Random> randomSupplierA = () -> new Random();
        Supplier<Random> randomSupplierB = Random::new;
        Function<Long, Random> randomWithParam = Random::new;

        System.out.println("Random number using lambda: " + randomSupplierA.get().nextInt(100));
        System.out.println("Random number using method reference: " + randomSupplierB.get().nextInt(100));
        System.out.println("Random number using method reference with parameter: " + randomWithParam.apply(100L).nextInt(100));

        printSeparator();

        // Pasar una referencia a partir de una instancia (En este caso String)
        String cadena = "Hello World!";
        Supplier<Integer> longitudA = () -> cadena.length();
        Supplier<Integer> longitudB = cadena::length;

        System.out.println("Length using lambda: " + longitudA.get());
        System.out.println("Length using method reference: " + longitudB.get());

        Predicate<String> startsWithA = (string) -> cadena.startsWith(string);
        Predicate<String> startsWithB = cadena::startsWith;

        System.out.println("Starts with 'H' using lambda: " + startsWithA.test("H"));
        System.out.println("Starts with 'H' using method reference: " + startsWithB.test("H"));

        printSeparator();


    }

    public static void printSeparator() {
        System.out.println("\n-----------------------------------------------------------\n");
    }
}
