public class PruebaCadenas {
    public static void main(String[] args) {
        // Los String's son INMUTABLES, no se pueden modificar
        String ejemplo = "Hoy es jueves 7 de Marzo del 2024";
        System.out.println(ejemplo.toUpperCase());
        String nueva = ejemplo.replace("e","*");
        System.out.println("Cadena original: "+ejemplo);
        System.out.println("Cadena nueva: "+nueva);
        System.out.println("Cadena original: "+ejemplo);

        // Los StringBuilder's son MUTABLES, se pueden modificar
        StringBuilder almacen = new StringBuilder("Hola");
        System.out.println("Almacen original: "+almacen);
        almacen.append(" Mundo!");
        System.out.println("Almacen original: "+almacen);
        almacen.delete(3,7);
        System.out.println("Almacen original: "+almacen);


    }
}
