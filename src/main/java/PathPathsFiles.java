import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.stream.Stream;

public class PathPathsFiles {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        //f85aa49b-7012-4a1f-985c-68a409614407
        //41f38894-dba9-4165-a099-7d8c7a3b475d   2^128
        String casa = System.getProperty("user.home");
        System.out.println();
        Path ruta = Paths.get(casa);
        Stream<Path> rutas = null;
        try {
            rutas = Files.walk(ruta);

            rutas.forEach(System.out::println);
        } catch (Exception e) {
            System.out.println("hubo un problemita...upps!!!");
        }
  }

}
