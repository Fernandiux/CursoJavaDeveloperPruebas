import java.util.function.*;

public class EjemplosLambda {
    public static void main(String[] args) {
//        Predicate<String> compara = (String s)->{return s.length()>5;};
        Predicate<String> compara = s->s.length()>5;
        System.out.println(compara.test("Fernando"));
        Predicate<Integer> esPar = i->i%2==0;
        int valor=25;
        System.out.println("Es par? "+valor+" "+ esPar.test(valor));

        Consumer<Integer> consumidor = dato-> {
            System.out.println("paso por aqui");
            return;
        };
        consumidor.accept(100);

        Function<String,Double> convierte = s->Double.parseDouble(s);
        double resultado = convierte.apply("34.25");
        System.out.println("Resultado de la conversion: "+resultado);

        Supplier<StringBuilder> proveedor = ()->new StringBuilder("Inicio del SB");
        StringBuilder nuevo = proveedor.get().append(" Fin del SB").reverse();
        System.out.println(nuevo);

        UnaryOperator<String> aMayusculas = s->s.toUpperCase();
        System.out.println(aMayusculas.apply("Hola Mundo!!!"));


    }
}
