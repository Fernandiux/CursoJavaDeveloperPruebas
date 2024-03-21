import java.util.*;
import java.util.function.*;

public class EjemploConsumer {

    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 25),
                new Persona("Ana", 30),
                new Persona("Pedro", 35)
        );

        List<Persona> personas2 = Arrays.asList(
                new Persona("Juan", "Rodriguez",25),
                new Persona("Ana", "Bolena",30),
                new Persona("Ana", "Armendariz", 35),
                new Persona("Juan", "Almazan", 35)
        );

        // Consumer que imprime el nombre y la edad de una persona
        Consumer<Persona> imprimirPersona = persona -> {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        };

        // Consumer que aumenta la edad en 1 año
        Consumer<Persona> aumentarEdad = persona -> persona.setEdad(persona.getEdad() + 1);


        // Se utiliza andThen() para combinar los dos Consumers
        personas.forEach(aumentarEdad.andThen(imprimirPersona));

        // Doble Sort
        personas2.stream().sorted(new ComparadorPersona()).forEach(p->System.out.println(p));

        }
    }




