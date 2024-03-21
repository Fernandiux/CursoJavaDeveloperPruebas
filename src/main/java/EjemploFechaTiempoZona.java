import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploFechaTiempoZona {
    public static void main(String[] args) {

        LocalDateTime hoy = LocalDateTime.now();
        //        ZoneId zona = ZoneId.of("Europe/Madrid");
        ZoneId zona = ZoneId.of("America/Bogota");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss z");
        ZonedDateTime colombia = ZonedDateTime.now(zona);
        String formattedTime = formatter.format(colombia);
        System.out.println(formattedTime);
    }
}
