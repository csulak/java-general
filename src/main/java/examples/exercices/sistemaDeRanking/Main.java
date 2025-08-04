package examples.exercices.sistemaDeRanking;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*-
        Enunciado
        Queremos implementar un pequeño sistema que maneje una lista de estudiantes y
        muestre un ranking según las siguientes reglas:

        Cada estudiante tiene:
        String nombre
        double promedio
        int edad

        Queremos:
        Ordenar la lista de estudiantes por:

        Promedio descendente
        Si hay empate en promedio, ordenar por edad ascendente
        Si aún hay empate, ordenar por nombre alfabéticamente

        Mostrar el ranking con el siguiente formato:

        1) Ana - 9.5 - 20 años
        2) Lucas - 9.5 - 22 años
        3) Pedro - 8.0 - 21 años
     */
    public static void main(String[] args) {
        Estudiante ana = new Estudiante("Ana", 9.5, 22);
        Estudiante lucas = new Estudiante("Lucas", 9.5, 22);
        Estudiante pedro = new Estudiante("Pedro", 8.0, 21);

        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(ana);
        estudiantes.add(lucas);
        estudiantes.add(pedro);


        // aca el sorted() va a usar el metodo compareTo que sobreescribimos en la clase Estudiante para la lista
        estudiantes.stream().sorted().forEach(estudiante -> System.out.println(estudiante));


        estudiantes.sort((es1, es2) -> es1.edad - es2.edad);


    }
}
