package examples.stackAndHead;

/**
 * En este ejemplo aprendo un poco el alcance de los objetos y las variables en cuanto a stack y heap.
 * El stack es donde se almacenan las variables locales y la referencia a los objetos,
 * mientras que el heap es donde se almacenan los objetos en sí.
 */
public class Main {
    public static void main(String[] args) {
        printSeparator();

        int i = 5; // Se guarda en el stack
        duplicar(i); // Se pasa por valor, por lo que no afecta al valor original
        System.out.println("El valor de i es: " + i);
        printSeparator();


        Integer j = 5; // Se guarda en el stack
        duplicarNoPrimitivo(j); // Se pasa por valor, pero como es un objeto envoltorio (wrapper), no afecta al valor original
        System.out.println("El valor de j es: " + j);
        printSeparator();



        Clase obj = new Clase(10); // la referencua (obj) se guarda en el stack, pero el objeto en sí se guarda en el heap
        duplicarObjeto(obj); // Se pasa la referencia del objeto, por lo que se modifica el objeto en el heap
        System.out.println("El valor de obj es: " + obj.valor);


        // los primitivos se guardan en el stack y se pasan por valor, no por referencia


    }

    private static void duplicar(int i) {
        i = i * 2;
    }

    private static void duplicarNoPrimitivo(Integer j) {
        j = j * 2;
    }

    private static void duplicarObjeto(Clase obj) {
        obj.valor = obj.valor * 2;
    }

    public static void printSeparator() {
        System.out.println("\n-----------------------------------------------------------\n");
    }
}
