package examples.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCapacity {

        public static void main(String[] args) {

            int n = 20_000_000;

            // --- 1️⃣ ArrayList sin capacity inicial ---
            long startNoCap = System.nanoTime();
            List<Integer> listaSinCap = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                listaSinCap.add(i);
            }
            long endNoCap = System.nanoTime();

            // --- 2️⃣ ArrayList con capacity inicial ---
            long startCap = System.nanoTime();
            ArrayList<Integer> listaConCap = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                listaConCap.add(i);
            }
            long endCap = System.nanoTime();

            // --- 3️⃣ ArrayList usando ensureCapacity ---
            long startEnsure = System.nanoTime();
            ArrayList<Integer> listaEnsure = new ArrayList<>();
            listaEnsure.ensureCapacity(n); // Esto me permite setear la capacity de un arrayList ya creado
            for (int i = 0; i < n; i++) {
                listaEnsure.add(i);
            }
            long endEnsure = System.nanoTime();

            // --- Resultados ---
            System.out.println("Tiempo sin capacity inicial: " + (endNoCap - startNoCap) / 1_000_000 + " ms");
            System.out.println("Tiempo con capacity inicial (constructor): " + (endCap - startCap) / 1_000_000 + " ms");
            System.out.println("Tiempo con ensureCapacity(): " + (endEnsure - startEnsure) / 1_000_000 + " ms");
        }

}


