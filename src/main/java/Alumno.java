import java.util.*;
public class Alumno {
    private String nombre;
    private List<Integer> calficaciones;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public Alumno(String nombre, List<Integer> calficaciones) {
        this.nombre = nombre;
        this.calficaciones = calficaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getCalficaciones() {
        return calficaciones;
    }

    public void setCalficaciones(List<Integer> calficaciones) {
        this.calficaciones = calficaciones;
    }
}
