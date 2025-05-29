package examples.record;

public record Persona(String nombre, String apellido, int edad)
{
    // si quiero puedo crear otros constructores, pero tendre que llamar al constructor padre
    public Persona(String nombre, String apellido)
    {
        this(nombre, apellido, 99); // Llamo al constructor principal con edad por defecto
    }

    // Puedo crear metodos adicionales
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }

}
