package examples.comparable;

import java.util.ArrayList;
import java.util.List;

/**
 * Aprendiendo a usar Comparable
 */
public class Main {

    public static void main(String[] args) {
        Humano humano1 = new Humano(55, 2, List.of("hambre", "miedo", "locura", "proyeccion"));
        Humano humano2 = new Humano(10, 3, List.of("hambre", "miedo", "locura", "proyeccion"));

        List<Humano> humanos = new ArrayList<>();
        humanos.add(humano1);
        humanos.add(humano2);

        // Esto no tiene un gran encanto. Simplemente devolvera un int dependiendo el caso
        System.out.println(humano1.compareTo(humano2));

        // Aca entra la gracia de implementar Comparable en la clase Humano.
        // De acuerdo a la logica que definimos en el metodo que sobreescribimos "compareTo()"
        // ahora podemos usar sorted() y no es necesario implementar la logica de como queremos que ordene aca.
        // Ya esta definido por la clase Humano lo cual toma mucho mas sentido ya que es su responsabilidad
        System.out.println(humanos.stream().sorted().toList());

        // En este ejemplo implemento directamente aca el comparator y defino por que voy a comparar.
        // la regla es siempre la misma, una lambda: "(a,b) -> a - b" Esto ordena de forma ascendente
        System.out.println(humanos.stream().sorted( (a, b) -> a.numeroDePiernas - b.numeroDePiernas).toList());
    }

}
