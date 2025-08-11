package examples.exercices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubStringMasLargoSinRepetirVLucas {

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
        String s = "acvva";


        int max = 0;
        Set<Character> set = new HashSet<>();

        int left = 0;

        for(int right = 0; right < s.length(); right++)
        {
            char currentChar = s.charAt(right);

            while(set.contains(currentChar))
            {
                set.remove(s.charAt(left));
                left ++;
            }

            set.add(currentChar);
            max = Math.max(max, right - left + 1);
        }

        System.out.println(set);
        System.out.println(max);



    }
}
