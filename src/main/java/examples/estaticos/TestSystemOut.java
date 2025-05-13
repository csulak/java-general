package examples.estaticos;

/**
 * Lo interesante que podemos ver aca es que el metodo "static" se ejecuta antes que el main.
 * Es decir que todos los estatico se van a ejecutar antes de que se ejecute el main.
 */
public class TestSystemOut {
    static {
        System.out.println("Bloque estático ejecutado");
    }

    public static void main(String[] args) {
        System.out.println("Método main ejecutado");
    }
}