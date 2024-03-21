import java.util.*;

public class EjemplosStreams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int suma = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra solo los números pares
                .mapToInt(numero -> numero) // Mapea los números a enteros
                .sum(); // Suma los números

        System.out.println("La suma de los números pares es: " + suma);


        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5);

        numeros2.stream()
                .peek(System.out::println)
                .filter(numero ->{
                    System.out.println("Filtrando número: " + numero);
                    return numero % 2 == 0;
                })
               .map(numero ->{
                    System.out.println("Mapeando número: " + numero);
                    return numero * 2;
                })
                .forEach(numero -> System.out.println("Número final: " + numero));
    }
}
