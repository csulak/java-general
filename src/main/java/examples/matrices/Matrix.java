package examples.matrices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix {

    public static void main(String[] args) {

        Arrays.asList(1,2,3).stream().filter(
                x -> {
                    System.out.println("Visiting " + x);
                    return x > 1;
                }
        ).forEach(System.out::println);

        System.out.println("hola!");
    }
}
