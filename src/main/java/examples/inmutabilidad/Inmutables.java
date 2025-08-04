package examples.inmutabilidad;

import java.util.ArrayList;
import java.util.List;

public class Inmutables {

    /**
     * Los wrappers de las variables primitivas son inmutables.
     *
     * Es decir, si le asigno un nuevo valor va a desferenciar el viejo valor y referenciar al nuevo valor
     */
    public static void main(String[] args) {

        Integer numero = 10; // Esto internamente creo el valor 10 no como primitivo si no como una instancia de Integer


        List<Integer> numeros = new ArrayList<>();
        numeros.add(numero);

        numero = 20; // asignamos un nuevo valor a "numero" al ser Integer inmutable no puede ser modificado, simplemente se crea una nueva instancia y esta es asignada a numero
        System.out.println(numero);
        System.out.println(numeros); // sigue apuntando a la referencia que tenia antes(10) de hacer la reasignacion (20)




        // Pequeña nota de color, los numeros entre -128 y 127 estan cacheados.
        // Por eso esto es true:
        Integer numeroChicoA = 10;
        Integer numeroChicoB = 10;
        System.out.println(numeroChicoA == numeroChicoB);

        // Pero esto es false
        Integer numeroGrandeA = 500;
        Integer numeroGrandeB = 500;
        System.out.println(numeroGrandeA == numeroGrandeB);
    }
}
