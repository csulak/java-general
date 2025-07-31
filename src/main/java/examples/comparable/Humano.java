package examples.comparable;

import java.util.List;

/**
 * Implementamos Comparable le pasamos el tipo Humano
 */
public class Humano implements Comparable<Humano> {

    int edad;
    int numeroDePiernas;
    List<String> pensamientos;

    public Humano(int edad, int numeroDePiernas, List<String> pensamientos) {
        this.edad = edad;
        this.numeroDePiernas = numeroDePiernas;
        this.pensamientos = pensamientos;
    }


    /**
     * Aca sobrescribimos la logica que queremos que aplique en el caso de querer comparar un humano contra otro
     * Misma que cuando implementamos Comparator (aca es Comparable)
     * un valor int positivo
     * un valor int negativo
     * un int 0 si son iguales
     *
     * Esto va a permitir si tenemos una lista de humanos, ordenarlos por algun criterio que hayamos elegido.
     * En este caso por edad, pero puede ser por cualquiera de sus atributos
     */
    @Override
    public int compareTo(Humano humano) {
        //return this.edad - humano.edad;

        // Esto es lo mismo que la linea de arriba, simplemente que aca devolvermos 1, -1 y 0
        if(this.edad > humano.edad)
        {
            return 1;
        }
        else if(this.edad < humano.edad)
        {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Humano{" +
                "edad=" + edad +
                ", numeroDePiernas=" + numeroDePiernas +
                ", pensamientos=" + pensamientos +
                '}';
    }
}
