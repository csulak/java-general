package examples.record;

public class RecordClassesMain
{
    public static void main(String[] args)
    {

        // Puedo crear instancias de la clase record como si fuera una clase normal
        Persona persona1 = new Persona("Juan", "Perez", 30);

        // Aca uso el constructor que toma solo nombre y apellido, y la edad por defecto es 99
        Persona persona2 = new Persona("Juan", "Perez");

        // Puedo acceder a los atributos de la clase record como si fueran metodos
        System.out.println("Persona 1: " + persona1.nombre() + " " + persona1.apellido() + ", Edad: " + persona1.edad());

        //Tambien se generan los metodos toString() y Equals()
        System.out.println("Persona 1 toString: " + persona1.toString());
        System.out.println("¿Persona 1 es igual a persona 2?: " + persona1.equals(persona2));

        // No puedo modificar los atributos de la clase record, ya que son inmutables (final)
        // persona1.nombre = "Pedro"; // Esto daria error de compilacion



    }
}
