package examples.exercices;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class top3PalabrasMasFrecuentes {


    /**
     * Implementá un programa en main que:
     *
     * Cuente la frecuencia de cada palabra (ignorando mayúsculas/minúsculas).
     *
     * Imprima solo las 3 palabras más frecuentes, en orden de mayor a menor ocurrencia.
     */
    public static void main(String[] args) {
        String texto = "Hola mundo hola Java hola mundo mundo java java Java mundo hola loco lucas lucas lucas mono mono";
        String textoToLowerCase = texto.toLowerCase(); // pasamos el texto a minuscula
        String[] palabras = textoToLowerCase.split(" "); // con split ponemos todas las palabras en un array


        Map<String, Integer> countOfWords = new HashMap<>();

        for(String palabra : palabras)
        {
            countOfWords.put(palabra, countOfWords.getOrDefault(palabra, 0) + 1);
        }
        // Aca ya creamos un map para guardar palabra como "key" y cantidad de apariciones como "value"
        System.out.println(countOfWords);


        // convertimos el mapa en un entrySet para poder manipularlo.
        // primero lo ordenamos (sorted)
        // limitamos el resultado a 3 (limit)
        // iteramos el entryset para imprimir los valores (foreach)
        countOfWords.entrySet().stream()
                        .sorted((entry1, entry2) ->  entry2.getValue() - entry1.getValue())
                                .limit(3)
                                        .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));


    }
}
