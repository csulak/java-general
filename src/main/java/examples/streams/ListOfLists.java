package examples.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Supongamos que tenemos una lista de listas y quiero convertirlo a una lista. como seria?
 */
public class ListOfLists {
    public static void main(String[] args) {

        List<Integer> subLista = new ArrayList<>();
        subLista.add(111);
        subLista.add(222);
        subLista.add(333);
        List<Integer> subLista2 = new ArrayList<>();
        subLista2.add(11);
        subLista2.add(22);
        subLista2.add(33);
        List<Integer> subLista3 = new ArrayList<>();
        subLista3.add(1);
        subLista3.add(2);
        subLista3.add(3);

        List<List<Integer>> listaDeListas = new ArrayList<>();
        listaDeListas.add(subLista);
        listaDeListas.add(subLista2);
        listaDeListas.add(subLista3);


        System.out.println("Lista de Listas:" + listaDeListas);


        // ahora convertirmos la lista de listas en una lista

        List<Integer> listaAplanada = listaDeListas.stream().flatMap(list -> list.stream()).toList();
        System.out.println("Lista aplanada: " + listaAplanada);
    }
}
