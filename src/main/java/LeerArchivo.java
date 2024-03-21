import java.io.*;

public class LeerArchivo {
    public static void main(String[] args) {

//        String archivo="c:\\datos2.txt";
        String archivo="datos2.txt";
        try {
            FileReader entrada = new FileReader(archivo);
            BufferedReader br = new BufferedReader(entrada);
            String lei="";
            while((lei=br.readLine())!=null){
                System.out.println(lei);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo "+archivo+" no se encontro!");
        } catch (IOException e) {
            System.out.println("Hubo un error en la lectura");
        }

    }
}
