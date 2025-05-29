package examples.patternMatching;

public class Main
{
    public sealed interface FiguraGeometrica permits Rectangulo, Triangulo, Cuadrado
    {
    }

    public record Rectangulo(float ancho, float alto) implements FiguraGeometrica
    {
    }

    public record Triangulo(float base, float altura) implements FiguraGeometrica
    {
    }

    public record Cuadrado(String nombreDelCuadrado, float lado) implements FiguraGeometrica
    {
        // Nota de color. Cuando aplico el switch para desempaquetar los datos,
        // no hace falta que los nombres matcheen. aca se llama "nombreDelCuadrado" y en el switch "nombre"
    }

    public static float area(FiguraGeometrica g){
        return switch (g) {
            // Los valores que estaremos desempaquetando (destructuring) son los que estan entre parentesis en las records
            // es decir, los atributos de las records
            // Si no se especifica el nombre de la variable, se puede usar un guion bajo (_) Esto funciona a partir de Java 22
            // !!!! Lo que si es importante es respetar el orden, despues el nombre puede diferir !!!
            case Rectangulo(float ancho, float alto) -> ancho * alto;
            case Triangulo(float base, float altura) -> (base * altura) / 2;
            case Cuadrado(String nombre, float lado) -> lado * lado;

            // default -> 0; // Ete ultimo return default no es necesario, ya que todas las figuras
            // estan cubiertas por el sealed interface FiguraGeometrica (permits Rectangulo, Triangulo, Cuadrado)
        };
    }

    public static float areaVersionOldSchool(FiguraGeometrica g)
    {
        // Esta seria la versiom vieja de aplicar el mismo concepto de desempaquetado (destructuring) de datos
        // pero sin usar el switch, sino con instanceof y casting

        if (g instanceof Rectangulo rectangulo) {
            return rectangulo.ancho() * rectangulo.alto();
        } else if (g instanceof Triangulo triangulo) {
            return (triangulo.base() * triangulo.altura()) / 2;
        } else if (g instanceof Cuadrado cuadrado) {
            return cuadrado.lado() * cuadrado.lado();
        }
        return 0; // Si no es ninguna figura, retorna 0
    }

    public static void main(String[] args)
    {

        FiguraGeometrica rectangulo = new Rectangulo(5, 10);
        FiguraGeometrica triangulo = new Triangulo(4, 8);
        FiguraGeometrica cuadrado = new Cuadrado("MiCuadrado", 6);

        System.out.println("Area del rectangulo: " + area(rectangulo));
        System.out.println("Area del triangulo: " + area(triangulo));
        System.out.println("Area del cuadrado: " + area(cuadrado));

    }
}
