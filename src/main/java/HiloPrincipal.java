public class HiloPrincipal {
    public static void main(String[] args) {
        Tarea t1 = new Tarea("Juan",10);
        Tarea t2 = new Tarea("Cesar",20);
        Thread hilo1 = new Thread(t1);
        Thread hilo2 = new Thread(t2);
        hilo2.start();
        hilo1.start();
    }
}
