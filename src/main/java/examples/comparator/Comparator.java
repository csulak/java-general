package examples.comparator;

import java.util.ArrayList;
import java.util.List;

public class Comparator {

    /**
     * Aprendiendo a usar la interfaz funcional "comparator"
     */
    public static void main(String[] args) {


        List<Integer> values = new ArrayList<>();
        values.add(54);
        values.add(22);
        values.add(512);
        values.add(98);
        values.add(1);
        values.add(44);
        values.add(44);

        List<Integer> valuesSorted =  values.stream().sorted((a,b ) -> {
            if (a > b)
            {
                return -1;
            }
            else if(a < b)
            {
                return 1;
            }
            return 0;
            // Esto es igual a hacer "return a - b " o "return b - a". ya que a-b o b-a va a hacer la
            // resta de ambos numeros y devolvera un numero negativo o positivo segun corrsponda
            // no es necesario que devuelva -1 o 1 o 0. Simplemente tiene que ser un numero positivo o un numero negativo

        }).toList();

        System.out.println(valuesSorted);
    }
}
