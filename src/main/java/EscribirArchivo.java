import java.io.IOException;

import java.io.*;
public class EscribirArchivo {

        public static void main(String[] args) {
            String archivo="c:\\users\\fernando\\datos2.txt";
            try {
                FileWriter salida = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(salida);
                String escribi ="Este es un texto.";
                bw.write(escribi);
                System.out.println("Escribi:"+escribi);
                bw.close();
            } catch (IOException e) {
                System.out.println("Hubo un error en la escritura");
                System.out.println(e);
            }

        }
    }

