package examples.exercices;

import java.util.HashSet;

public class SubStringMasLargoSinRepetir {

    /**
     * Dado un string s, encontrar la
     * longitud de la subcadena más larga que no contenga caracteres repetidos.
     *
     * Ejemplos:
     * Input: "abcabcbb"
     * Output: 3   // "abc"
     *
     * Input: "bbbbb"
     * Output: 1   // "b"
     *
     * Input: "pwwkew"
     * Output: 3   // "wke"
     */
    public static void main(String[] args)
    {
        String s = "abaaalokj";
        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++)
        {

            char current = s.charAt(right);

            // Si el caracter ya está en la ventana, movemos 'left' hasta eliminarlo
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(current);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen); ;
    }
}
