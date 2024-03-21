public class PersonaNueva implements Comparable<PersonaNueva> {
    private String nombre;
    private int edad;
    private String ciudadOrigen;
    private char sexo;


    public PersonaNueva(String nombre, int edad, String ciudadOrigen, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudadOrigen = ciudadOrigen;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "PersonaNueva{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", ciudadOrigen='" + ciudadOrigen + '\'' +
                ", sexo=" + sexo +
                '}';
    }

    @Override
    public int compareTo(PersonaNueva personaNueva) {
        return this.nombre.compareToIgnoreCase(personaNueva.nombre);  //-1 0 +1
    }
}
