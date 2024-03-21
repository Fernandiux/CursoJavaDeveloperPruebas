import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FechasTiempo {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy: "+ hoy);//Universal AA-MM-DD
        LocalDate nuevo = hoy.plusWeeks(2).plusDays(4);
        LocalDate nuevo2 = hoy.plusMonths(1);
        System.out.println("Futuro: " +nuevo);
        System.out.println("Mes futuro: "+nuevo2);
        LocalTime tiempo = LocalTime.now();
        System.out.println(tiempo);
        LocalDate proximaSemana = LocalDate.of(2024,3,17);
        System.out.println(proximaSemana);
        LocalTime tiempo2 = LocalTime.of(9,10,5,7);
        System.out.println(tiempo2);
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
    }
}
