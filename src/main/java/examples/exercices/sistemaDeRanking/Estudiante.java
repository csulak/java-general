package examples.exercices.sistemaDeRanking;

public class Estudiante implements Comparable<Estudiante>{

    String nombre;
    double promedio;
    int edad;

    public Estudiante(String nombre, double promedio, int edad) {
        this.nombre = nombre;
        this.promedio = promedio;
        this.edad = edad;
    }

    // Esta seria la forma old school de implementar el compareTo para atributos como promedio (double) y edad (int)
    // fijate que sin querer al momento de comparar los strings de nombre ya usaste el "compareTo" de String sin hacer todos los if
    // abajo esta el ejemplo usando los "compareTo" de Double e Integer
    @Override
    public int compareTo(Estudiante otro) {
        if (this.promedio < otro.promedio)
        {
            return 1;
        }
        else if (this.promedio > otro.promedio)
        {
            return -1;
        }
        else if (this.edad > otro.edad)
        {
            return 1;
        }
        else if (this.edad < otro.edad)
        {
            return -1;
        }
        return this.nombre.compareTo(otro.nombre);

    }

    /*-
    // Forma simplificada de hacer lo mismo usando los comparators de Double e Integer
    @Override
    public int compareTo(Estudiante otro) {
        int cmp = Double.compare(otro.promedio, this.promedio); // descendente
        if (cmp == 0) {
            cmp = Integer.compare(this.edad, otro.edad); // ascendente
        }
        if (cmp == 0) {
            cmp = this.nombre.compareTo(otro.nombre);
        }
        return cmp;
    }
     */

    @Override
    public String toString() {
        return nombre + " - " + promedio + " - " + edad + " años";
    }
}
