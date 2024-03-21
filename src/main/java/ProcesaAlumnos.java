import java.util.*;
import java.util.stream.IntStream;

public class ProcesaAlumnos {
    public static void main(String[] args) {
        List<Alumno> lista = new ArrayList<>();
        lista.add(new Alumno("Juan",List.of(9,8,10)));
        lista.add(new Alumno("Juan",List.of(7,8,9)));
        lista.add(new Alumno("Juan",List.of(10,6,8)));
        double promedio = lista.stream()
                .flatMapToInt(alumno->alumno.getCalficaciones().stream()
                        .peek(System.out::println)
                        .mapToInt(Integer::intValue))
//                .peek(System.out::println)
                .average().orElse(0);
        System.out.println(promedio);


    }
}
