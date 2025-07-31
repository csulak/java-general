package examples.exercices;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ContarOcurrenciaDePalabras {

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
            if (countOfPalabras.containsKey(palabra))
            {
                int aux_cont = countOfPalabras.get(palabra);
                countOfPalabras.put(palabra, aux_cont + 1);
            }
            else
            {
                countOfPalabras.put(palabra, 1);
            }

        }

        System.out.println(countOfPalabras);

    }
}
