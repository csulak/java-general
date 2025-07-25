package examples.exercices;

import java.util.List;

public class HallarPrimerCaracterQuenoSeRepite
{
    public static void main(String[] args)
    {
        String cadena = "estoeszunacadenadetexto";


        char[] caracteresChar = cadena.toCharArray();

        for (int index = 0; index < caracteresChar.length; index++)
        {
            char caracter = caracteresChar[index];
            boolean repetido = false;
            for (int j = 0; j < caracteresChar.length; j++)
            {
                if (index != j && caracter == caracteresChar[j])
                {
                    repetido = true;
                    break;
                }
            }
            if (!repetido)
            {
                System.out.println("El primer caracter que no se repite es (version 1): " + caracter);
                break;
            }
        }





        List<Character> caracteres = cadena.chars()
                .mapToObj(c -> (char) c)
                .toList();


        for (int index = 0; index < caracteres.size(); index++)
        {
            char caracter = caracteres.get(index);
            if (caracteres.indexOf(caracter) == caracteres.lastIndexOf(caracter))
            {
                System.out.println("El primer caracter que no se repite es (version 2): " + caracter);
                return;
            }
        }

    }

}
