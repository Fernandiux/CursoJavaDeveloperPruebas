import java.util.Comparator;

public class ComparadorPersona implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {

        int comparacionNombre = p1.getNombre().compareTo(p2.getNombre());
        if (comparacionNombre == 0) {
            return p1.getAppellido().compareTo(p2.getAppellido());
        } else {
            return comparacionNombre;
        }
    }
}
