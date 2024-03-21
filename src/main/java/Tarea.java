import java.time.LocalTime;

public class Tarea implements Runnable{
    private String nombre;
    private int tiempo;

    public Tarea(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public void run() {
        System.out.println("En ejecucion la tarea: "+nombre+" inicio a las "+ LocalTime.now());
        for(int i=1;i<=tiempo;i++){
            System.out.println("Nombre: "+nombre+" voy en "+i);
        }
        try {
            Thread.currentThread().join(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hola soy "+nombre+" ya termine! a las "+ LocalTime.now());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", tiempo=" + tiempo +
                '}';
    }
}
