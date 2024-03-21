import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploSortedSimplificado {

    public static void main(String[] args) {

        List<Persona> personas2 = Arrays.asList(
                new Persona("Juan", "Rodriguez",25),
                new Persona("Ana", "Bolena",30),
                new Persona("Ana", "Armendariz", 35),
                new Persona("Juan", "Almazan", 35)
        );

//        List<Person> sortedPersons = persons.stream()
//                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
//                .collect(Collectors.toList());
//
//        sortedPersons.forEach(System.out::println);
//
//        public int compare(Persona p1, Persona p2) {
//
//            int comparacionNombre = p1.getNombre().compareTo(p2.getNombre());
//            if (comparacionNombre == 0) {
//                return p1.getAppellido().compareTo(p2.getAppellido());
//            } else {
//                return comparacionNombre;
//            }
//        }


        // Doble Sort Ejemplo en Ingles

//        List<Person> sortedPersons = persons.stream()
//                .sorted(Comparator.comparing(Person::getName)
//                        .thenComparing(Person::getLastName))
//                .collect(Collectors.toList());

        personas2.stream().sorted(Comparator.comparing(Persona::getNombre)
                .thenComparing(Persona::getAppellido)).forEach(System.out::println);

        }
    }




