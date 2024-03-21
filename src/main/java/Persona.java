
public class Persona extends Object {
    // atributos, variables de instancia, campos
    private String nombre;
    private String appellido;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre, String appellido, int edad) {
        this.nombre = nombre;
        this.appellido = appellido;
        this.edad = edad;
    }

    private static String nacionalidad="Mexicana";

    public static String getNacionalidad() {
        return nacionalidad;
    }

    public static void setNacionalidad(String nacionalidad) {
        Persona.nacionalidad = nacionalidad;
    }

    public void imprime(){
        String s = "Sistema de Control de Personas";
        System.out.println(s);
        System.out.println("Nombre:"+ getNombre() + " " + "Edad: "+ getEdad());

    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", appellido='" + appellido + '\'' +
                ", edad=" + edad +
                ", nacionalidad='" + getNacionalidad() + '\'' +
                '}';
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppellido() {
        return appellido;
    }

    public void setAppellido(String appellido) {
        this.appellido = appellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
