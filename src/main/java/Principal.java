import java.lang.*;

public class Principal {
    public static void main(String [] args){
       System.out.println("Hola Mundo de Java");
       final byte b = 127;
       double d = 10./3;
       System.out.println("R="+d);
       System.out.println("R2="+d*3);
       boolean estaLloviendo=true;
       char c = '\n';
       var miVariable=55;
       miVariable=(int)10.8;
       System.out.println(("Entero: "+miVariable));

       Persona p1 = new Persona();
       Persona p2 = new Persona();
        p1.setNombre("Fernando");
        p2.setNombre("Reina");
        p2.setEdad(22);
       p1.setEdad(57);
        p2.setNacionalidad("Italiana");
        System.out.println(p1);
        System.out.println(p2);

        String texto = "Este es el texto Original";
        System.out.println(texto);
        String nueva = texto.toUpperCase();
        System.out.println("Texto despues de invocar el metodo;"+texto);
        System.out.println("Texto modificado:"+nueva);
        System.out.println(texto.charAt(6));
        String separador = "-".repeat(30);
        System.out.println(separador);

       // String union = texto.concat(nueva);
        String union = texto+nueva;
        System.out.println("Concatenacion: "+union);

        String cadenaLarga= "\""+
                "asdf asd f sadf as df asdf as df asfd s afd sa df as df as df adf\n"+
                "asdfadf asd fsa df sadf sa fd sadf sa df as df sadf  a\n"+
                "fsdaasdf\n"+
                "as\n"+
                "sdfasdfa asdf asd fsa df sadf sfd   afsd \n";
        String cadenaMultilines= """
                Este
                es 
                un texto muy largo
                pero 
                se escribe
                simple
                  """;


        System.out.println(cadenaLarga);

        System.out.println(cadenaMultilines);



    }
}
