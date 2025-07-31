package examples.exercices;

import java.util.HashMap;
import java.util.Map;

public class ContarOcurrenciaDePalabrasV2 {

    /**
     * Implementá un programa en el main que cuente cuántas veces aparece cada palabra (sin importar mayúsculas/minúsculas) y lo imprima así:
     *
     * String texto = "Hola mundo hola Java hola mundo mundo";
     * hola -> 3
     * mundo -> 3
     * java -> 1
     */
    public static void main(String[] args) {
        String texto = "Hola mundo hola Java hola mundo mundo";
        texto = texto.toLowerCase();
        String[] palabras = texto.split(" ");

        Map<String, Integer> countOfPalabras = new HashMap<>();
        for(String palabra : palabras)
        {
            countOfPalabras.put(palabra, countOfPalabras.getOrDefault(palabra, 0) + 1);

        }

        System.out.println(countOfPalabras);

    }
}
