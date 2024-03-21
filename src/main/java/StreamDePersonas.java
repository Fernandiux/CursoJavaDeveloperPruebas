import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDePersonas {

    public static void main(String[] args) {
        List<PersonaNueva> lista = new ArrayList<>();
        lista.add(new PersonaNueva("Zaira", 27, "EDOMEX", 'F'));
        lista.add(new PersonaNueva("Carolina", 18, "EDOMEX", 'F'));
        lista.add(new PersonaNueva("Victor", 30, "CDMX", 'M'));
        lista.add(new PersonaNueva("Javier", 32, "CDMX", 'M'));
        lista.add(new PersonaNueva("Edgar", 28, "NL", 'M'));
        lista.add(new PersonaNueva("Daniela", 36, "SON", 'F'));
        lista.add(new PersonaNueva("Luz", 25, "PUE", 'F'));
        lista.add(new PersonaNueva("Ernesto", 13, "OAX", 'M'));
        lista.add(new PersonaNueva("Alicia", 29, "QRO", 'F'));
        lista.add(new PersonaNueva("Jorge", 41, "VER", 'M'));

//         Proceso iterativo con un for
        for(PersonaNueva persona: lista){
            System.out.println(persona);
        }
          lista.forEach(p->System.out.println("PERSONA: "+p));

//        lista.stream().forEach(persona->System.out.println(persona));
//
//        lista.stream()
//                .filter(persona->persona.getEdad()>18)
//                .filter(persona->persona.getCiudadOrigen().equals("CDMX"))
//                .forEach(System.out::println);
////
//        lista.stream()
//                .filter(persona->persona.getCiudadOrigen().equals("CDMX") && persona.getEdad()>18)
//                .forEach(System.out::println);

//        lista.stream().map(PersonaNueva::getNombre).forEach(System.out::println);

//        lista.stream().filter(p->p.getNombre().startsWith("E")).forEach(System.out::println);

//                lista.stream()
//                .filter(persona->persona.getEdad()>18).peek(System.out::println)
//                .filter(persona->persona.getCiudadOrigen().equals("CDMX")).peek(System.out::println)
//                .forEach(System.out::println);

//        lista.stream()
//                .filter(persona->persona.getEdad()>18).peek(p->System.out.println("Mayor de 18: "+p.getNombre()))
//                .filter(persona->persona.getCiudadOrigen().equals("CDMX")).peek(p->System.out.println("Ciudad de origen: "+p.getCiudadOrigen()))
//                .forEach(System.out::println);
//
//        lista.stream().sorted((p1, p2) -> p1.getCiudadOrigen().compareTo(p2.getCiudadOrigen())).forEach(System.out::println);
//        lista.stream()
//                .sorted(Comparator.comparing(PersonaNueva::getCiudadOrigen)
//                        .thenComparing(PersonaNueva::getNombre))
//                .forEach(System.out::println);
//        lista.stream()
//                .sorted(Comparator.comparing(PersonaNueva::getCiudadOrigen))
//                .findFirst()
//                .ifPresent(System.out::println);
//
//                int suma = lista.stream()
//                .filter(persona->persona.getEdad()>18)//.peek(p->System.out.println("Mayor de 18: "+p.getNombre()))
//                .filter(persona->persona.getCiudadOrigen().equals("CDMX"))//.peek(p->System.out.println("Ciudad de origen: "+p.getCiudadOrigen())
//                        .mapToInt(PersonaNueva::getEdad).sum();
//        System.out.println("La suma fue: "+suma);//        OptionalDouble promedio = lista.stream()
//                          .mapToInt(PersonaNueva::getEdad).average();
//        if (promedio.isPresent()){
//            System.out.println("El promedio fue: "+promedio.getAsDouble());
//        }else {
//            System.out.println("No hay elementos en la lista");
//        }
//        List<PersonaNueva> mujeres = lista.stream()
//                .filter(personaNueva -> personaNueva.getSexo()=='F')
//                .sorted()
//                .toList();
//        mujeres.forEach(System.out::println);
//        Map<String, List<PersonaNueva>> grupos = lista.stream().collect(Collectors.groupingBy(PersonaNueva::getCiudadOrigen));
//        System.out.println(grupos);
//        for (String estado : grupos.keySet()) {
//            System.out.println(estado);
//            grupos.get(estado).forEach(p->System.out.println(p.getNombre()));
//        }
//        Map<String,List<PersonaNueva>>
//        "CDMX", List<PersonaNueva>
//       "EDOMEX", List<PersonaNueva>
//
//        Map<Boolean, List<PersonaNueva>> grupos = lista.stream()
//                .collect(Collectors.partitioningBy(p->p.getSexo()=='F'));
//        System.out.println(grupos);
//        for (Boolean sexo : grupos.keySet()) {
//            System.out.println(sexo?"MUJERES:":"HOMBRES:");
//            grupos.get(sexo).forEach(p->System.out.println(p.getNombre()));
//        }
//        int edad=25;
//        boolean seEncontro = lista.stream().anyMatch(personaNueva -> personaNueva.getEdad()==edad);
//        System.out.println("Se encontro uno de "+edad+" años?:"+(seEncontro?"SI":"NO"));
//        int años=10;
//        boolean siEsta = lista.stream().allMatch(personaNueva -> personaNueva.getEdad()>=años);
//        System.out.println("Todos sonmayores o iguales a "+años+" años?:"+(siEsta?"SI":"NO"));
        System.out.println("=".repeat(50));
        int laEdad = 18;
        lista.stream().takeWhile(persona -> persona.getEdad() >= laEdad).forEach(System.out::println);

    }
}




